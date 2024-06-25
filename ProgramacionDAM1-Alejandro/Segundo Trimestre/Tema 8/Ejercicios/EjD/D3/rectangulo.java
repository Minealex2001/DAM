package EjD.D3;


        class rectangulo {
            int x1;
            int y1;
            int x2;
            int y2;
        
            public rectangulo(int x1, int y1, int x2, int y2) {
                this.x1 = x1;
                this.y1 = y1;
                this.x2 = x2;
                this.y2 = y2;
            }
        
            public int getAncho() {
                return Math.abs(x2 - x1);
            }
        
            public int getAlto() {
                return Math.abs(y2 - y1);
            }
        
            public int getPerimetro() {
                return (getAncho() + getAlto()) * 2;
            }
        
            public int getArea() {
                return getAncho() * getAlto();
            }
        
            public void setX1(int x1) {
                this.x1 = x1;
            }
        
            public void setY1(int y1) {
                this.y1 = y1;
            }
        
            public void setX2(int x2) {
                this.x2 = x2;
            }
        
            public void setY2(int y2) {
                this.y2 = y2;
            }
        }
