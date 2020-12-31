<template>
    <div>
        <Header></Header>
        <Aside></Aside>
        <router-view></router-view>
    </div>
</template>

<script>
import Header from './TheHeader'
import Aside from './TheAside'

export default {
    components:{
        Header,
        Aside
    }
}
</script>