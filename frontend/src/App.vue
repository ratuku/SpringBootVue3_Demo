<template>
    <div id="app">
        <nav>
            <button @click="openNav" > &#9776; </button>
            <router-link to="/">
                <div class="navigation__logo">
                    Cars
                </div>
            </router-link>
        </nav>

        <div id="mySidenav" class="sidenav-container">

<!--            <div class="drawer-close-button" @click="closeNav">
                <button>  &#10006; </button>
            </div>-->

            <br>
            <router-link to="/cars/top_cars" id="routerTopCars">
                <a id="top-cars" @click="closeNav"> Top Cars Of All Time </a>
            </router-link>
            <br>
            <br>
            <router-link to="/cars/current_cars" id="routerCurrentCars">
                <a id="current-cars" @click="closeNav"> 2020 Top Cars </a>
            </router-link>
        </div>



        <div id="content-block">
            <br>
            <br>
            <router-view/>
        </div>

    </div>
</template>

<script>
    //import HelloWorld from './components/HelloWorld.vue'

    export default {
        name: 'App',
        setup() {
            
            function openNav() {
                let styleWidth = document.getElementById("mySidenav").style.width;
                console.log('styleWidth',styleWidth);
                if (styleWidth.includes('%')) {
                    document.getElementById("mySidenav").style.width = "0";
                }
                else {
                    document.getElementById("mySidenav").style.width = "15%" //opens side navbar by 70 percent
                    //document.getElementById('content-block').style.display = "block" //displays overlay
                }
                console.log("openNav");
            }

            function closeNav() {
                document.getElementById("mySidenav").style.width = "0px";
                //document.getElementById('content-block').style.display = "none"
            }

            return {
                openNav,
                closeNav
            }
        }
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
            align-items: center;
            display: flex;
            position: relative;
            justify-content: space-between;
            align-items: center;
            padding: 10px 5%;
            background-color: #E0E0E0;

            .navigation__logo {
                font-size: 24px;
                font-weight: bold;
                align-items: center;
            }

            .mobile-nav-open-icon {
                font-size: 2rem;
                cursor: pointer;
                margin-right: 2rem;
                color: black;
                margin-left: 3rem;
            }
        }

        #content-block {
            display: block;
            position: inherit;
            overflow: auto;
            -webkit-animation: fadeIn 1.2s ease-in-out;
            animation: fadeIn 0.5s ease-in-out;
        }

        .sidenav-container {
            height: 100%;
            width: 0px;
            position: fixed;
            background-color: #E0E0E0;
            overflow-x: hidden;
            transition: 0.5s;
            padding-top: 10px;
            display: flex;
            flex-direction: column;
            align-items: center;

            #routerCurrentCars :hover {
                font-weight: bold;
            }

            #routerTopCars :hover {
                font-weight: bold;
            }

            .closebtn {
                font-size: 3rem;
                font-weight: 700;
                color: #2c3e50;
                padding-right: 1rem;
            }

            .drawer-close-button {
                display: flex;
                justify-content: flex-end;
                align-items: center;
                margin-bottom: 2rem;
            }
        }
    }
</style>
