abstract class Figura {
    public abstract void calcularArea();
}

class Circle extends Figura {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radius * radius;
        System.out.println("El área del círculo es: " + area);
    }
}

class Square extends Figura {
    private double base;
    private double height;

    public Square(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calcularArea() {
        double area = base * height;
        System.out.println("El área del cuadrado es: " + area);
    }
}

class Triangle extends Figura {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calcularArea() {
        double area = 0.5 * base * height;
        System.out.println("El área del triángulo es: " + area);
    }
}

class Rectangle extends Figura {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calcularArea() {
        double area = base * height;
        System.out.println("El área del rectángulo es: " + area);
    }
}

class Pentagon extends Figura {
    private double side;
    private double apothem;

    public Pentagon(double side, double apothem) {
        this.side = side;
        this.apothem = apothem;
    }

    @Override
    public void calcularArea() {
        double area = 0.5 * 5 * side * apothem;
        System.out.println("El área del pentágono es: " + area);
    }
}



