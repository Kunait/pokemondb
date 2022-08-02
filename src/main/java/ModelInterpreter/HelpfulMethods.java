package ModelInterpreter;

import Model.GenerationsEnum;
import Model.Regions;

public class HelpfulMethods {


    public static String[] enumGenerationToString(GenerationsEnum e){
        switch (e){
            case ONE ->{ return new String[]{"red-blue","yellow"}; }
            case TWO ->{return new String[]{"gold-silver","crystal"};}
            case THREE -> {return new String[]{"ruby-sapphire","emerald","firered-leafgreen"};}
            case FOUR -> {return new String[]{"heartgold-soulsilver","diamond-pearl","platinum"};}
            case FIVE -> {return new String[]{"black-white","black-2-white-2"};}
            case SIX -> {return new String[]{"x-y","omega-ruby-alpha-sapphire"};}
            case SEVEN -> {return new String[]{"sun-moon","ultra-sun-ultra-moon"};}
            case EIGHT -> {return new String[]{"sword-shield","yellow"};}
            default -> {return null;}

        }
    }
    public static String enumGenerationGetLastGames(GenerationsEnum e){
        switch (e){
            case ONE ->{ return "red-blue"; }
            case TWO ->{return "gold-silver";}
            case THREE -> {return "emerald";}
            case FOUR -> {return "platinum";}
            case FIVE -> {return "black-2-white-2";}
            case SIX -> {return "x-y";}
            case SEVEN -> {return "ultra-sun-ultra-moon";}
            case EIGHT -> {return "sword-shield";}
            default -> {return null;}

        }
    }
    public static String enumGenerationGetLastGame(GenerationsEnum e){
        switch (e){
            case ONE ->{ return "red"; }
            case TWO ->{return "gold";}
            case THREE -> {return "emerald";}
            case FOUR -> {return "platinum";}
            case FIVE -> {return "black-2";}
            case SIX -> {return "x";}
            case SEVEN -> {return "ultra-sun";}
            case EIGHT -> {return "sword";}
            default -> {return null;}

        }
    }

    public static int enumGenerationToInt(GenerationsEnum e){

        switch (e) {
            case ONE -> {return 1;}
            case TWO -> {return 2;}
            case THREE -> {return 3;}
            case FOUR -> {return 4;}
            case FIVE -> { return 5;}
            case SIX -> {return 6;}
            case SEVEN -> {return 7;}
            case EIGHT -> {return 8;}
        }
        return 0;
    }

    public static int enumRegionToInt(Regions e){

        switch (e) {
            case KANTO -> {return 1;}
            case JOHTO -> {return 2;}
            case HOENN -> {return 3;}
            case SINNOH -> {return 4;}
            case UNOVA -> { return 5;}
            case KALOS -> {return 6;}
            case ALOLA -> {return 7;}
            case GALAR -> {return 8;}
        }
        return 0;
    }

    public static Regions intRegionToEnum(int e){

        switch (e) {
            case 1 -> {return Regions.KANTO;}
            case 2 -> {return Regions.JOHTO;}
            case 3 -> {return Regions.HOENN;}
            case 4 -> {return Regions.SINNOH;}
            case 5 -> { return Regions.UNOVA;}
            case 6 -> {return Regions.KALOS;}
            case 7 -> {return Regions.ALOLA;}
            case 8 -> {return Regions.GALAR;}
        }
        return null;
    }

    public static int enumGenerationToIntRegion(GenerationsEnum e){
        switch (e) {
            case ONE -> {return 1;}
            case TWO -> {return 2;}
            case THREE -> {return 3;}
            case FOUR -> {return 4;}
            case FIVE -> { return 5;}
            case SIX -> {return 6;}
            case SEVEN -> {return 7;}
            case EIGHT -> {return 8;}
        }
        return 0;
    }

    public static GenerationsEnum intGenerationToEnum(int e){

        switch (e) {
            case 1 -> {return GenerationsEnum.ONE;}
            case 2 -> {return GenerationsEnum.TWO;}
            case 3 -> {return GenerationsEnum.THREE;}
            case 4 -> {return GenerationsEnum.FOUR;}
            case 5 -> { return GenerationsEnum.FIVE;}
            case 6 -> {return GenerationsEnum.SIX;}
            case 7 -> {return GenerationsEnum.SEVEN;}
            case 8 -> {return GenerationsEnum.EIGHT;}
        }
        return null;
    }


    public static String capitalizeFirst(String s){


        if(!s.contains("-"))
        return s.replaceFirst(s.substring(0,1),s.substring(0,1).toUpperCase());
        else{
            s = s.replaceFirst(s.substring(0,1),s.substring(0,1).toUpperCase());
            String temp = s.substring(s.indexOf("-")+1,s.indexOf("-")+2);

            s = s.replace("-"+temp,"-"+temp.toUpperCase());
            return s;
        }

    }
}
