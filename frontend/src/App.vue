<template>
  <div id="app">
    <nav>
      <router-link to="/">
        <div class="navigation__logo">
          Cars
        </div>
      </router-link>
    </nav>

    <router-view/>
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
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 10px 5%;
    background-color: #E0E0E0;

    .navigation__logo {
      font-size: 24px;
      font-weight: bold;
    }

    h1 {
      display: inline;
      align-items: center;
    }
  }
}
</style>
