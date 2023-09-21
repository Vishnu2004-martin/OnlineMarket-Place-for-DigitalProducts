import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { addDatatoProduct } from "./Service/Api";
import axios from "axios";
import './Page.css'


function Page() {
    const navigate = useNavigate();
    const[formdata,setFormData]=useState({
        prodname: "",
        prodprice: "",
        proddec: "",
        fkcustomerid:""
    });
    const[updateData,setUpdatedata]=useState({
        prodid:"",
        prodname: "",
        prodprice: "",
        proddec: "",
        fkcustomerid:""
    });
    const [deleteId,SetDeleteId] = useState();
    const [items,Setitems]=useState({});
    const handleChange1=(e)=>{
        const {name,value}=e.target;
        setUpdatedata({
            ...updateData,
            [name]:value
        });
    };
    const handleChange=(e)=>{
        const {name,value}=e.target;
        setFormData({
            ...formdata,
            [name]:value
        });
    };
    useEffect(() => {
        axios.get(`http://localhost:8181/get`)
        .then((res)=>{
            Setitems(res.data);
            console.log(res.data);
        })
        .catch((err) => {
            console.log(err);
          });
      },[items]);
    console.log(formdata);
    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(formdata);
        addDatatoProduct(formdata)
        .then((result) => {
          console.log(result);
          setFormData({
            prodname: "",
            prodprice: "",
            proddec: "",
            fkcustomerid:""
          });
          //navigate('/');
        }).catch((err) => {
          console.log(err);
        });
      };
      const handleSubmit2 = (e) => {
        e.preventDefault();
        console.log(formdata);
        axios.put(`http://localhost:8181/update/${updateData.prodid}`,updateData)
        .then((result) => {
          console.log(result);
          setUpdatedata({
            prodid:"",
            prodname: "",
            prodprice: "",
            proddec: "",
            fkcustomerid:""
          });
          //navigate('/');
        }).catch((err) => {
          console.log(err);
        });
      };
      const handleDelete = (e)=>{
        e.preventDefault();
        axios.delete(`http://localhost:8181/delete/${deleteId}`)
        .then((res)=>{
            console.log("Deleted Successfully");
            SetDeleteId("");
        })
        .catch((err)=>{
            console.log("error");
        })
      }
  return (
    <div>
      <h3 className="header">Add Product</h3>
      <form onSubmit={handleSubmit}>
        <label>Product name</label>
        <input name="prodname" value={formdata.prodname} onChange={handleChange}></input>
        <label>Product price</label>
        <input name="prodprice" value={formdata.prodprice} onChange={handleChange}></input>
        <label>Product Description</label>
        <input name="proddec" value={formdata.proddec} onChange={handleChange}></input>
        <label>Customer Id</label>
        <input name="fkcustomerid" value={formdata.fkcustomerid} onChange={handleChange}></input>
        <button type="submit" className="form-button">Sumbit</button>
      </form>
      <div>
        <h3 className="header">Delete Product</h3>
        <label>Delete ID</label>
        <input value={deleteId} onChange={(e)=>(SetDeleteId(e.target.value))}></input>
        <button onClick={handleDelete} className="form-button">submit</button>
        <form onSubmit={handleSubmit2}>
          <h3 className="header">Update Product</h3>
        <label>Product Id</label>
        <input name="prodid" value={updateData.prodid} onChange={handleChange1}></input>
        <label>Product name</label>
        <input name="prodname" value={updateData.prodname} onChange={handleChange1}></input>
        <label>Product price</label>
        <input name="prodprice" value={updateData.prodprice} onChange={handleChange1}></input>
        <label>Product Description</label>
        <input name="proddec" value={updateData.proddec} onChange={handleChange1}></input>
        <button type="submit" className="form-button">Sumbit</button>
      </form>
          {items?.map((item)=>(
            <div key={items.prodid}>
                <h1 className="Text">Product Id : {item.prodid}</h1>
                <h1 className="Text">Product Name : {item.prodname}</h1>
                <h1 className="Text">Product Price : {item.prodprice}</h1>
                <h1 className="Text">Product Description : {item.proddec}</h1>
            </div>
          ))}
      </div>
    </div>
  );
}

export default Page;
