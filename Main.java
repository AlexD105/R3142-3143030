public class Main {
    public static void main(String[] args) {
        Human telbol = new Human("Телерепортер Болтик");
        Human telzril = new Human("Телезрители");
        TV_things screen = new TV_things("экран");
        TV_things flash = new TV_things("мелькание");
        Mouth mouth = new Mouth("рот");
        Arm arm = new Arm("рука");
        Eye eye = new Eye("взор");
        Picture earth = new Picture("земля");
        Picture trees = new Picture("деревья");
        Picture house = new Picture("дом");
        Picture sky = new Picture("небо");
        Picture cloud = new Picture("облака");
        Picture police = new Picture("фигура полицейского");
        Picture air = new Picture("воздух");
        Picture face = new Picture("физиономия");
        Timelaps moment = new Timelaps("миг");




        telbol.close(mouth.getName(), arm.getName());
        System.out.print(", ");
        telbol.cough("LITE");
        System.out.print(", ");
        telbol.lookaround("PAST");
        telbol.continues(Predlog_USSR.AND);
        System.out.println();
        telzril.see("THIS_TIME");
        screen.own(Predlog_USSR.NA, "MY");
        flash.course("POR");
        System.out.print(". ");
        System.out.println();
        eye.whose(Predlog_USSR.PERED, "THEM");
        earth.arice("SUDDENLY");
        trees.together(Predlog_USSR.S, "TOGETHER");
        house.soyuz(Predlog_USSR.I);
        System.out.print(", ");
        System.out.println();
        sky.flashed("COATED", cloud.getName());
        System.out.print(", ");
        moment.sometimes(Predlog_USSR.NA);
        police.appear(Predlog_USSR.IN, air.getName());
        face.distorted(Predlog_USSR.S);
        System.out.print(". ");
    }
}