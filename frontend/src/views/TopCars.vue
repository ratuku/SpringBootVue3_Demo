<template>
    <div>
        <h2>Top Cars of All Time</h2>

        <br>
        <br>

        <di>
            <ul id="list-rendering">
                <li v-for="(item, index) in data" v-bind:key="index">
                    {{item}}
                </li>
            </ul>
        </di>
    </div>
</template>

<script>
    import axios from 'axios';
    //import {onBeforeMount} from 'vue';

    export default {
        name: "TopCars",
        data() {
            return {
                data: {}
            }
        },
        methods: {
            async getTopCars() {
                const varData = await axios.get('http://localhost:8181/api/data/car')
                    .then(function (response) {
                        if (response.status !== 200 && response.status !== 201) {
                            console.log("Error when getting top cars: " + response.status);
                            return;
                        }
                        // get data from Json
                        return response;
                    })
                    .catch(e => {
                        console.log("Error: ", e);
                        return;
                    });

                return varData;
            },
            loadData() {
                this.getTopCars().then(response => {
                    this.data = response.data;
                });
            }
        },
        mounted() {
            this.loadData();
        }
    }
</script>

<style scoped>

</style>