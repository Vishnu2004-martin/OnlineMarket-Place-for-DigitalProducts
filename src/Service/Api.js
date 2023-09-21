import axios from 'axios';

const url = "http://localhost:8181";

const addData = (data) => axios.post(`${url}/api/v1/user/signup`, data);
const addDatatoProduct = (data) => axios.post(`${url}/post`,data);
const getData = (data) => axios.post(`${url}/api/v1/user/login`, data);
export {addData,getData,addDatatoProduct};