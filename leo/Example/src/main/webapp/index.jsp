<html>
<jsp:include page="WEB-INF/page/common/_js.jsp"></jsp:include>
<body>
    <div id="app">
        <h2>hello world</h2>
        <div v-html="message"></div>
    </div>
</body>
<script>
    new Vue({
        el: '#app',
        data: {
            message: '<h1>Hello Vue.js!</h1>'
        }
    })
</script>
</html>
