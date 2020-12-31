<template>
    <div>
        <Header></Header>
        <Aside></Aside>
        <div class="content-box" :class="{'content-collapse' :collapse}">
            <router-view></router-view>            
        </div>

    </div>
</template>

<script>
import Header from './TheHeader'
import Aside from './TheAside'
import bus from '../assets/js/bus'

export default {
    components:{
        Header,
        Aside
    },
    data(){
        return {
            collapse: false
        }
    },
    created(){
        bus.$on('collapse',msg => {
            this.collapse = msg
        })
    }
}
</script>