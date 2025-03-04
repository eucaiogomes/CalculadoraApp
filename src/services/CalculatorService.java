package services;

public class CalculatorService {
    
    // Variáveis para armazenar os números da operação
    private double num1, num2;
    // Variável para armazenar o operador matemático
    private char mathSymbol;

    // Método para obter o operador matemático
    public char getMathSymbol() {
        return mathSymbol;
    }

    // Método para definir o operador matemático
    public void setMathSymbol(char mathSymbol) {
        this.mathSymbol = mathSymbol;
    }

    // Método para definir o primeiro número
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    // Método para definir o segundo número
    public void setNum2(double num2) {
        this.num2 = num2;
    }    
    
    // Método para somar os dois números
    public double add() {
        return this.num1 + this.num2;
    }
    
    // Método para subtrair o segundo número do primeiro
    public double subtract() {
        return this.num1 - this.num2;
    }
    
    // Método para multiplicar os dois números
    public double multiply() {
        return this.num1 * this.num2;
    }
    
    // Método para dividir o primeiro número pelo segundo
    public double divide() {
        // Evita divisão por zero
        if (num2 == 0) {
            throw new ArithmeticException("Erro: divisão por zero não permitida.");
        }
        return this.num1 / this.num2;
    }
}