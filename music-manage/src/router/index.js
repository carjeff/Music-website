import Vue from 'vue'
import Router from 'vue-router'
import Login from '../pages/Login'
import Info from '../pages/InfoPage'
import Home from '../components/Home'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/Home',
      name: 'Home',
      component: Home,
      children:[
        {       
          path: '/Info',
          // name: 'Info',
          // component: Info
          component: resolve => require(['../pages/InfoPage.vue'],resolve)
        },
        {       
          path: '/Consumer',
          component: resolve => require(['../pages/ConsumerPage.vue'],resolve)
        },
        {       
          path: '/Singer',
          component: resolve => require(['../pages/SingerPage.vue'],resolve)
        },
        {       
          path: '/SongList',
          component: resolve => require(['../pages/SongListPage.vue'],resolve)
        },
        
      ]
    }
  ]
})
