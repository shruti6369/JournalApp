import axios from 'axios';

export const api = axios.create({
  baseURL: '/api',   // proxy ke through backend
  timeout: 10000,
});
