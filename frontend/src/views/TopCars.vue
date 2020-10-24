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

    export default {
        name: "TopCars",
        setup() {
            let data = getTopCars() || {};

            function getTopCars() {
                axios.get('http://localhost:8181/api/data/car')
                    .then(
                        response => {
                            console.log(response)
                            return response.data;
                        }
                    )
                .catch(e => {
                    console.log("Error: ", e);
                    return;
                })

                return {
                    data
                }
            }
        }
    }
</script>

<style scoped>

</style>