/**
 * The Collidable interface.
 */
public interface Collidable {
    /**
     * Finds the collision Rectangle.
     * @return the collision Rectangle
     */
    Rectangle getCollisionRectangle();
    /**
     * Notify the hitted object.
     * @param collisionPoint the Point of collision
     * @param currentVelocity the velocity of the collision
     * @return the new Velocity of the hitting object
     */
    Velocity hit(Point collisionPoint, Velocity currentVelocity);
    /**
     * Performs deep cloning of the Collidable object.
     * @return a clone of the Collidable object
     */
    Collidable cloneDeep();
    /**
     * @return A String describing the Collidable.
     */
    String toString();
}