package rocks.zipcode.io.objectorientation;

public class Television {
    TVChannel channel;
    Boolean tvOn = false;

    public void turnOn() {
        tvOn = true;
    }

    public void setChannel(Integer channel) {
        if (tvOn) {
            this.channel = TVChannel.getByOrdinal(channel);
        }
        else
        {
            throw new IllegalStateException("TV NOT ON");
        }
    }

    public TVChannel getChannel() {
        if (tvOn) {
            return channel;
        }
        else
        {
            throw new IllegalStateException("TV NOT ON");
        }
    }
}
