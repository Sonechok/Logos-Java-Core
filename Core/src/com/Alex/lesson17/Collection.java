package com.Alex.lesson17;

public class Collection {
    private Number[] arrayOfNumbers;

    public Collection(Number[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    class FirstTask implements Iterator<Number>{
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex < arrayOfNumbers.length && arrayOfNumbers[currentIndex] != null) {
                return true;
            } else {

                return false;
            }
        }

        @Override
        public Number next() {
            if (arrayOfNumbers[currentIndex] instanceof Integer) {
                int data = arrayOfNumbers[currentIndex].intValue();
                if (data % 2 == 0) {
                    return arrayOfNumbers[currentIndex++];
                } else {
                    currentIndex++;
                    return 0;
                }
            } else {
                return arrayOfNumbers[currentIndex++];
            }
        }
    }

    class SecondTask implements Iterator<Number>{
        private int currentIndex = arrayOfNumbers.length - 1;
        private int position = 1;

        @Override
        public boolean hasNext() {
            if (currentIndex >= 0 && arrayOfNumbers[currentIndex] != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Number next() {

            if (position%2==0) {
                position++;
                currentIndex--;
                return null;
            } else {
                position++;
                return arrayOfNumbers[currentIndex--];
            }
        }
    }

    public Iterator<Number> thirdTask(){
        return new Iterator<Number>() {
            private int currentIndex = arrayOfNumbers.length - 1;
            private int position = 1;
            @Override
            public boolean hasNext() {
                if (currentIndex >= 0 && arrayOfNumbers[currentIndex] != null) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Number next() {
                if (position%3==0) {
                    position++;
                    if (arrayOfNumbers[currentIndex] instanceof Integer) {
                        int data = arrayOfNumbers[currentIndex].intValue();
                        if (data % 2 == 0) {
                            currentIndex--;
                            return null;
                        } else {
                            return arrayOfNumbers[currentIndex--];
                        }
                    } else {
                        currentIndex--;
                        return null;
                    }
                } else {
                    position++;
                    currentIndex--;
                    return null;
                }
            }
        };
    }

    public Number[] fourthTask(){
        Number[] newArrayOfNumbers = new Number[arrayOfNumbers.length];
        class FourthTask implements Iterator<Number>{
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                if (currentIndex < arrayOfNumbers.length && arrayOfNumbers[currentIndex] != null) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Number next() {
                if(currentIndex%4==0 && currentIndex!=0) {
                    if (arrayOfNumbers[currentIndex] instanceof Integer) {
                        int data = arrayOfNumbers[currentIndex].intValue();
                        if (data % 2 == 0) {
                            return arrayOfNumbers[currentIndex++].intValue() - 100;
                        } else {
                            currentIndex++;
                            return null;
                        }
                    } else {
                        currentIndex++;
                        return null;
                    }
                } else {
                    currentIndex++;
                    return null;
                }
            }
        }
        FourthTask fourthTask = new FourthTask();
        int position = 0;
        while (fourthTask.hasNext()){
            newArrayOfNumbers[position] = fourthTask.next();
            position++;
        }
        return newArrayOfNumbers;
    }

    static class FifthTask implements Iterator<Number>{
        private Number[] arrayOfNumbers;
        private int currentIndex = 0;

        public FifthTask(Number[] arrayOfNumbers) {
            this.arrayOfNumbers = arrayOfNumbers;
        }

        @Override
        public boolean hasNext() {
            if (currentIndex < arrayOfNumbers.length && arrayOfNumbers[currentIndex] != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Number next() {
            if (arrayOfNumbers[currentIndex] instanceof Integer) {
                int data = arrayOfNumbers[currentIndex].intValue();
                if (data % 2 == 0) {
                    return arrayOfNumbers[currentIndex++].intValue()+0.5;
                } else {
                    currentIndex++;
                    return null;
                }
            } else {
                currentIndex++;
                return null;
            }
        }
    }

}
