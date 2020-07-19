package ru.vtsybin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic.getSong());

       // Music music = context.getBean("musicBean", Music.class);
       // MusicPlayer musicPlayer = new MusicPlayer(music);

      /*  MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer seconfMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean copmarision = firstMusicPlayer == seconfMusicPlayer;

        System.out.println(copmarision);

        System.out.println(firstMusicPlayer);
        System.out.println(seconfMusicPlayer);

        firstMusicPlayer.setVolue(10);

        System.out.println(firstMusicPlayer.getVolue());
        System.out.println(seconfMusicPlayer.getVolue());
*/
 /*       System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolue());*/

        context.close();

    }
}
