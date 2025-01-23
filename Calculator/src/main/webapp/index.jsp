<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
    <style>
        body {
            background: linear-gradient(to right, #ff7e5f, #feb47b);
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #fff;
        }
        h2 {
            margin-bottom: 20px;
        }
        input, select, button {
            padding: 10px;
            margin: 5px 0; /* Adjusted margin for vertical spacing */
            border: none;
            border-radius: 5px;
            font-size: 16px;
            width: 100%; /* Set width to 100% for full width */
        }
        input[type="number"] {
            /* Removed specific width to allow full width */
        }
        select {
            /* Removed specific width to allow full width */
        }
        button {
            background-color: #ff6f61;
            color: white;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.2s;
        }
        button:hover {
            background-color: #ff4c3b;
            transform: scale(1.05);
        }
        #result {
            margin-top: 20px;
            font-size: 20px;
            padding: 10px;
            border-radius: 5px;
            background-color: rgba(255, 255, 255, 0.2);
            color: #fff;
            border: 1px solid #fff;
            text-align: center;
        }
        .highlight {
            font-weight: bold;
            font-size: 24px;
            color: #ffeb3b; /* Highlight color for the answer */
        }
    </style>
    <script>
        function calculate() {
            var num1 = parseFloat(document.getElementById("num1").value);
            var num2 = parseFloat(document.getElementById("num2").value);
            var operator = document.getElementById("operator").value;
            var result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    result = "Invalid operator";
            }
            document.getElementById("result").innerHTML = "Result: <span class='highlight'>" + result + "</span>";
        }
    </script>
</head>
<body>
    <div style="width: 300px;"> <!-- Set a fixed width for the calculator -->
        <h2>Simple Calculator</h2>
        <input type="number" id="num1" placeholder="First Number">
        <input type="number" id="num2" placeholder="Second Number">
        <select id="operator">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <button onclick="calculate()">Calculate</button>
        <p id="result"></p>
    </div>
</body>
</html>