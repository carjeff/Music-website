import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Button from '../components/Button';
import Login from '../components/Login'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/Button',
      name: 'Button',
      component: Button
    },
    {
      path: '/',
      name: 'Login',
      component: Login
    }
  ]
})
