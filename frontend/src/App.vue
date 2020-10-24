<template>
  <div id="app">
     <nav>
        <span onclick="openNav()" class="mobile-nav-open-icon">&#9776;</span>
        <router-link to="/">
            <div class="navigation__logo">
            Cars
            </div>
        </router-link>
    </nav>

    <div id="mySidenav" class="sidenav-container">

        <span class="drawer-close-button">
            <a href="javascript:void(0)" class="closebtn"></a>
        </span>

        <router-link to="/cars/top_cars">
            <a id="top-cars"> Top Cars </a>
        </router-link>
        <router-link to="/cars/current_cars">
            <a id="current-cars"> Top Cars </a>
        </router-link>
    </div>

    <div id="content-block">
        <router-view/>
    </div>

  </div>
</template>

<script>
//import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App'
}
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0px;

  nav {
    width: 100%;
      height: 5vh;
    display: flex;
    align-items: center;
    padding: 10px 5%;
    background-color: #E0E0E0;

    .navigation__logo {
      font-size: 24px;
      font-weight: bold;
      align-items: center;
    }

      .mobile-nav-open-icon{
          font-size: 2rem;
          cursor: pointer;
          margin-right: 2rem;
          color: black;
          margin-left:3rem;
      }
  }

    #content-block {
        display: block;
        position: fixed;
        z-index: 2;
        left: 0;
        top: 0;
        width: 100%;
        height: 100%;
        overflow: auto;
        -webkit-animation: fadeIn 1.2s ease-in-out;
        animation: fadeIn 1.2s ease-in-out;
    }

    .sidenav-container {
        height: 100%;
        width: 0;
        position: fixed;
        z-index: 3;
        top: 0;
        left: 0;
        background-color: #111;
        overflow-x: hidden;
        transition: 0.5s;
        padding-top: 10px;
        display: flex;
        flex-direction: column;
        align-items: center;

        this:hover {
            color: #f1f1f1;
        }

        this .closebtn {
            font-size: 3rem;
            font-weight: 700;
            color:#C9002B ;
            padding-right: 1rem;
        }

        this .drawer-close-button{
            height: 3rem;
            width: 100%;
            display: flex;
            justify-content: flex-end;
            align-items: center;
            margin-bottom: 3rem;
        }
    }
}
</style>
