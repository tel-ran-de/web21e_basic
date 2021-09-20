package incapsulation;

public class Algebra {
    private int op1;
    private int op2;

    public Algebra(int op1, int op2) {
        this.op1 = op1;
        if (op2 == 0) {
            System.out.println("Not for division");
        }
        this.op2 = op2;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public void setOp2(int op2) {
        if (op2 == 0) {
            System.out.println("Not for division. Old value = " + this.op2);
            return;
        }
        this.op2 = op2;
    }

    public int getDivision() {
        return op2 != 0 ? op1 / op2 : -1;
    }
}
