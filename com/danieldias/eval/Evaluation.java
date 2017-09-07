package com.danieldias.eval;

/**
 * This class models a com.danieldias.eval.Evaluation Exam. This is a abstract class, which
 * means that it serves only as a model to its inherited classes.
 *
 * @author Daniel Dias
 * @version 1.0
 */
public abstract class Evaluation {
    private String title = "TBD";
    private double weight = 10;

    /**
     * Default constructor sets the title to TBD and the weight
     * to a default value of 10.
     *
     * @throws IllegalArgumentException if the title or weight are invalid
     */
    public Evaluation() {}

    /**
     * Constructs an com.danieldias.eval.Evaluation object with a given title and weight
     *
     * @param title the title of the com.danieldias.eval.Evaluation Exam
     * @param weight the weight of the com.danieldias.eval.Evaluation Exam
     * @throws IllegalArgumentException if title or weight contain invalid values
     */
    public Evaluation(String title, double weight) throws IllegalArgumentException {
        setTitle(title);
        setWeight(weight);
    }
    /**
     * Retrieves the title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title. The title cannot be empty and also cannot have a null value.
     *
     * @param title the title to set
     *
     * @throws IllegalArgumentException if the title is empty or has a null value.
     */
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("The Title cannot be empty");
        }
        this.title = title;
    }

    /**
     * Retrieves the weight.
     *
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight. The weight cannot be equal or smaller than zero
     *
     * @param weight the weight to set
     *
     * @throws IllegalArgumentException if the weight is zero or less
     */
    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("The Weight needs to be higher than zero");
        }
        this.weight = weight;
    }

    /**
     * Abstract method. Will be defined in the inherited classes.
     *
     */
    public abstract double achievedWeight();

}
