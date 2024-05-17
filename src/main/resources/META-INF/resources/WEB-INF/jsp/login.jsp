<html>
    <body>
        <div class="container">
        <h1>Welcome to Login Page</h1>
        <pre>${errorMessage}</pre>
        <form action="/login" method="POST">
            Name: <input type="text" name="name" >
            Password: <input type="password" name="password">
            <input type="submit">
        </form>
        </div>
    </body>
</html>