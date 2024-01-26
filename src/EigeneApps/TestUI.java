package EigeneApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestUI {
    private static boolean errorDisplayed = false;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TestUI::createAndShowUI);
    }

    private static void createAndShowUI() {
        JFrame frame = new JFrame("Taschenrechner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 24));
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(inputField, BorderLayout.NORTH);

        inputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (errorDisplayed) {
                    inputField.setText(""); // Lösche das Feld, wenn zuvor ein Fehler angezeigt wurde
                    errorDisplayed = false;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {
                        String expression = inputField.getText();
                        double result = evaluateExpression(expression);
                        if (result % 1 == 0) {
                            inputField.setText(String.valueOf((int) result)); // Ergebnis als Ganzzahl anzeigen
                        } else {
                            inputField.setText(String.valueOf(result));
                        }
                    } catch (Exception ex) {
                        inputField.setText("Fehler");
                        errorDisplayed = true;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Nicht benötigt
            }
        });

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String buttonLabel : buttons) {
            JButton button = new JButton(buttonLabel);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String buttonText = ((JButton) e.getSource()).getText();
                    if (buttonText.equals("=")) {
                        try {
                            String expression = inputField.getText();
                            double result = evaluateExpression(expression);
                            if (result % 1 == 0) {
                                inputField.setText(String.valueOf((int) result)); // Ergebnis als Ganzzahl anzeigen
                            } else {
                                inputField.setText(String.valueOf(result));
                            }
                        } catch (Exception ex) {
                            inputField.setText("Fehler");
                            errorDisplayed = true;
                        }
                    } else {
                        if (errorDisplayed) {
                            inputField.setText(""); // Lösche das Feld, wenn zuvor ein Fehler angezeigt wurde
                            errorDisplayed = false;
                        }
                        // Prüfe, ob das Eingabefeld leer ist, bevor ein Operator hinzugefügt wird
                        if (!inputField.getText().isEmpty() || Character.isDigit(buttonText.charAt(0))) {
                            if (inputField.getText().isEmpty()) {
                                // Füge keinen Operator hinzu, wenn das Feld leer ist
                                if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
                                    return;
                                }
                            }
                            inputField.setText(inputField.getText() + buttonText);
                        }
                    }
                }
            });
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static double evaluateExpression(String expression) {
        System.out.println("Evaluate Expression: " + expression); // Debug-Ausgabe

        expression = expression.replaceAll("\\s", "");

        String operator = "";
        for (char c : expression.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = String.valueOf(c);
                break;
            }
        }

        if (operator.isEmpty()) {
            throw new IllegalArgumentException("Ungültiger Ausdruck: " + expression);
        }

        String[] tokens = expression.split("[" + operator + "]");
        double num1 = Double.parseDouble(tokens[0]);
        double num2 = Double.parseDouble(tokens[1]);

        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
                }
            default:
                throw new IllegalArgumentException("Ungültiger Operator: " + operator);
        }
    }
}