package edu.ccsu.cs417.cs417group1.emotion;

public interface IEmotion
{
    public void express();
    public void addComponent(IEmotion e);
    public IEmotion removeComponent(String desc);
    public IEmotion getChild(String desc);
    public double getIntensity();
    public String getDescription();
}
