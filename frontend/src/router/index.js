import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../views/Home.vue'
import TopCars from "../views/TopCars";
import CurrentCars from "../views/CurrentCars";

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/cars/top_cars',
    name: 'TopCars',
    component: TopCars
  },
  {
    path: '/cars/current_cars',
    name: 'CurrentCars',
    component: CurrentCars
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
