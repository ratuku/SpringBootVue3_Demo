<template>
    <div>
        <h2>Top Cars of 2020</h2>
        <br>

        <div id="row-cards">
            <div id="card1">
                <div class="card">
                    <h1>Volvo</h1>
                    <div class="container">
                        <h2> 1 </h2>
                        <p>
                            SUV/SEDAN
                        </p>
                    </div>
                </div>
            </div>

            <div id="card2">
                <div class="card">
                    <h1>BMW</h1>
                    <div class="container">
                        <h2> 1 </h2>
                        <p>
                            SUV/SEDAN
                        </p>
                    </div>
                </div>
            </div>

        </div>

        <div id="row-table">
            <br>

            <tab>
                <thead>
                <tr>  <th>&nbsp;</th> <th>Car Name </th>  <th> Price Range </th>  </tr>
                </thead>

                <tbody>
                <tr v-for="item in data" v-bind:key="item.id">
                    <th>{{item.id}}</th> <th> {{item.name}} </th>  <th> {{item["price-range"]}} </th>
                </tr>
                </tbody>

            </tab>
        </div>
    </div>
</template>

<script>
    export default {
        name: "CurrentCars",
        setup() {

            const data = [
            {'id': "1",
                "name": "2021 Volvo S60",
                "price-range": "$37,750 - $64,800"
            },
            {'id': "2",
                "name": "2021 GTI",
                "price-range": "$29,690 to $38,740"},
            {'id': "3",
                    "name": "2020 Ferrari Portofino M",
                    "price-range": "R4,771,000"},
            {'id': "4",
                    "name": "2021 Volvo S60",
                    "price-range": "$37,750 - $64,800"},
            {'id': "5",
                    "name": "2020 Ford Mustang",
                    "price-range": "R768,000 - R995,400"},
            {'id': "6",
                    "name": "2021 Tesla Cybertruck",
                    "price-range": "$40,000 - $70,000"}
            ]

            return {
                data
            }
        }
    }
</script>

<style lang="scss">

   .card {
         box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
         transition: 0.3s;
        width: 40%;
       margin-left: 30%;

         &:hover {
             box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
         }

         .container {
             padding: 2px 16px;
         }
   }

/*    #row-cards {
        border: 1px solid red;
        margin:10px;
        float:left;!*Add float left*!
        margin :10px;
    }*/

</style>