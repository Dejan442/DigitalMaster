<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="sr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kontakt Forma</title>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            background-color: #1e1e2f;
            color: white;
        }

        header {
            background-color: #cc0000;
            color: white;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
        }

        nav ul li {
            margin: 0 15px;
        }

        nav ul li a {
            text-decoration: none;
            color: white;
            font-weight: bold;
            transition: color 0.3s;
        }

        nav ul li a:hover {
            color: #ffe6e6;
        }

        main {
            padding: 0;
            margin: 0;
            text-align: center;
            position: relative;
            background-image: url('pc.jpg');
            background-size: cover;
            background-position: center;
            min-height: 100vh;
        }

        .contact-form {
            background-color: rgba(0, 0, 0, 0.5);
            color: white;
            padding: 20px;
            border-radius: 8px;
            max-width: 400px;
            margin: 50px auto;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.3);
        }

        .contact-form h1 {
            color: #cc0000;
            margin-bottom: 20px;
        }

        .contact-form label {
            display: block;
            text-align: left;
            margin-bottom: 5px;
            font-weight: bold;
        }

        .contact-form input, .contact-form textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
        }

        .contact-form button {
            background-color: #cc0000;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .contact-form button:hover {
            background-color: #a00000;
        }

        footer {
            background-color: #cc0000;
            color: white;
            text-align: center;
            padding: 20px;
            width: 100%;
        }

        @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap');
    </style>
   
</head>
<body>
    <header>
        <div><strong>DIGITAL-MASTER</strong></div>
        <nav>
            <ul>
                <li><a href="Usluge.html">Usluge</a></li>
                <li><a href="prodaja.html">Prodaja</a></li>
                <li><a href="Kontakt.html">Kontakt</a></li>
                <li><a href="o-nama.html">O nama</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <div class="contact-form">
            <h1>Kontaktirajte nas</h1>
            <form action="BazaPorudzbina" method="post">
            
            
            
                          <label for="value1">Izabrali ste</label>
            <input type="text"  name="vrednost" value="${vrednost1}" readonly><br>
            
                <label for="name">Ime:</label>
                <input type="text" id="ime" name="ime" placeholder="Ime" required>

                <label for="surname">Prezime:</label>
                <input type="text" id="prezime" name="prezime" placeholder="Prezime" required>

                <label for="email">E-mail:</label>
                <input type="email" id="email" name="email" placeholder="Vasa e-mail adresa" required>

                

                <button type="submit">Posalji</button>
            </form>
        </div>
    </main>

    <footer>
        <p>&copy; 2024 Kontakt Forma. Sva prava zadržana.</p>
    </footer>
</body>
</html>

</html>