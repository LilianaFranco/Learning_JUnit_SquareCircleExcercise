    public class Square implements HasArea {

        //Properties
        private Double side;
        private Double area;


        //Constructor
        public Square(Double side) {
            this.side = side;
        }

        //Getters and Setter
        public Double getSide() {
            return side;
        }

        public void setSide(Double side) {
            this.side = side;
        }

        //Methods
        @Override
        public Double getAreaFigure() {
            Double squareArea;
            if(side>0){
                squareArea = this.side * this.side;
                System.out.println("El área del cuadrado es: " + squareArea);
                return squareArea;
            }else{
                System.out.println("El valor del lado debe ser mayor que cero");
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
