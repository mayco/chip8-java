package be.khleuven.arnautsmichael.chip8;

/**
 *
 * @author Micha�l Arnauts
 */
public interface ISound {
    public void startSound();    
    public void stopSound();
    
    public void setEnabled(boolean isEnabled);    

    public boolean isEnabled();
}
