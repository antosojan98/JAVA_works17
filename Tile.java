/**
 * Created by t00556250 on 2/25/2017.
 */
         public class Tile  {


        private String image;
        private boolean faceUP;

        /**
         * Constructor for the Tile class. initially, face-down.
         *
         * @param word a tile is created with the string word
         */
        public Tile(String word) {
            image = word;
            faceUP=false;
            // Your code goes here
        }

        /**
         * Shows image on face-up Tile
         *
         * @return image if Tile is face-up; otherwise returns the empty string
         */
        public String showFace() {

            if (faceUP==true)
            {
                return image ;
            }
          else
            return image= "" ;

            // Your code goes here
        }

        /**
         * Checks whether Tile is face-up.
         *
         * @return true if Tile is face-up; false otherwise
         */
        public boolean isFaceUp() {
          if (faceUP== true )
            {
                return true ;
            }
            else
                return false ;

        }

        /**
         * Getter method for image
         *
         * @return the image string.
         */
        public String getImage() {
            return image;
        }

        /**
         * Compares images on Tiles
         *
         * @param other image to be compared to image on this tile
         * @return true if the image on other is the same as this image; false
         * otherwise
         */
        @Override
        public boolean equals(Object other) {


            if (this==other)
                return true;
            if (other == null)
                return false;
         //   if (this != other )
           ///     return false;
            else
                return true ;
            // Your code goes here
            // self check

            // null check

            // type check and cast

            // field comparison

        }

        /**
         * Turns Tile face-up Precondition: Tile is turned face-up
         */
        public void turnFaceUp() {
             faceUP = true  ;
            // Your code goes here
        }

        /**
         * Turns Tile face-down Precondition: Tile is turned face-down
         */
        public void turnFaceDown() {
            faceUP= false  ;
            // Your code goes here
        }

    }


