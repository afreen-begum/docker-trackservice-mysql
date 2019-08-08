package com.stackroute.seeddata;
import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// It will get execute, after the server get starts

@Component
//Property source annotation is used to externalize configuration to a property file.
@PropertySource("classpath:application.properties")
public class CommandLineRunnerImpl implements CommandLineRunner {
    private TrackRepository trackRepository;
    @Autowired
    public CommandLineRunnerImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Track track1=new Track(1,"afreen","good");
        trackRepository.save(track1);
        Track track2=new Track(3,"shaik","awesome");
        trackRepository.save(track2);
    }
}