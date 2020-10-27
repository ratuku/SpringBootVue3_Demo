<template>
    <div>
        <h2>Top Cars of 2020</h2>
        <br>

        <div id="row-cards">
            <div id="card1">
                <Card :card="cardData" />
            </div>

            <div id="card2">
                <Card :card="cardData2" />
            </div>

        </div>

        <div id="row-table">
            <br>
            <br>
            <h3> Top Cars </h3>

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
    import Card from "../components/Card";

    export default {
        name: "CurrentCars",
        components: {Card},

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

            const cardData = {
                "number":1,
                "name": "SUV/SEDAN",
                "title": "BMW"
            }

            const cardData2 = {
                "number":2,
                "name": "HTBK",
                "title": "Volvo"
            }

            return {
                data,
                cardData,
                cardData2
            }
        }
    }
</script>

<style lang="scss">

/*    #row-cards {
        border: 1px solid red;
        margin:10px;
        float:left;!*Add float left*!
        margin :10px;
    }*/

</style>