/**
 * Java doesn’t allow extending multiple classes.
 * It’s to keep it simple and avoid diamond problem.
 * In above example, if Java had allowed multiple class inheritance, then which super update() method should get called?
 * There could be a mechanism to fix this, but Java language developers thought it’s better to keep it simple by not allowing multiple inheritance.
 */
public interface DiamondProblemwithMultipleInheritance {
    void update();
}

class DiamondProblemwithMultipleInheritanceImpl_1 implements DiamondProblemwithMultipleInheritance {

    public void update() {

    }
}

class DiamondProblemwithMultipleInheritanceImpl_2 implements DiamondProblemwithMultipleInheritance {

    public void update() {

    }
}

/**
class DiamondProblemwithMultipleInheritanceImpl_3 extends DiamondProblemwithMultipleInheritanceImpl_1, DiamondProblemwithMultipleInheritanceImpl_2 {

    public void setUserName() {
        super.update();
    }
}
**/