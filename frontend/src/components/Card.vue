<template>
        <div class="card-item">
            <h1> {{card.title}}  </h1>
            <div class="container">
                <h2> {{card.number}} </h2>
                <p>
                    {{card.name}}
                </p>
            </div>
        </div>
</template>

<script>
    export default {
        name: "Card",
        props: {
            card: {
                type: Object,
                required: true
            }
        }
    }
</script>

<style lang="scss" scoped>

    .card-item {
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

</style>