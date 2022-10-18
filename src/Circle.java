    public class Circle implements HasArea {

        //Properties
        private Double radius;
        private Double area;


        //Constructor
        public Circle(Double radius) {
            this.radius = radius;
        }

        //Getters and Setter
        public Double getRadius() {
            return radius;
        }

        public void setRadius(Double radius) {
            this.radius = radius;
        }

        //Methods
        @Override
        public Double getAreaFigure() {
            Double circleArea;
            if(this.radius>0){
                circleArea = Math.PI * (this.radius*this.radius);
                System.out.println("El área del círculo es: " + circleArea);
                return circleArea;
            } else {
                System.out.println("El valor del radio debe ser mayor que cero");
                return null;
            }
        }

        @Override
        public Double getArea() {
            return area;
        }

        public void setArea(Double area) {
            this.area = area;
        }


    }
