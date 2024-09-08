fun main() {



    //conversion of pounds to KG
    print("Weight in Pounds (lbs) : ")
    val lbs = readln()!!.toDouble()
    val toKG = lbs * 0.453592
    println("Weight converted to Kilograms (kg): $toKG ")
    println("=================================")

    //conversion of Miles to KM
    print("Length in Miles(mi): ")
    val miles = readln()!!.toDouble()
    val toKM = miles * 1.60934;
    println("Length in Kilometers(km): $toKM")
    println("=================================")

    //Conversion of Fahreheit to Celcius
    print("Temperature in Fahrenheit (F): ")
    val fahrenheit = readln()!!.toDouble()
    val toCelcius = (fahrenheit - 32) * 5/9
    println("Temperature in Celsius (C): $toCelcius ")
    println("=================================")

    //Average age of 10 students
    print("Age of Student 1: ")
    val student1 = readln()!!.toInt()
    print("Age of Student 2: ")
    val student2 = readln()!!.toInt()
    print("Age of Student 3: ")
    val student3 = readln()!!.toInt()
    print("Age of Student 4: ")
    val student4 = readln()!!.toInt()
    print("Age of Student 5: ")
    val student5 = readln()!!.toInt()
    print("Age of Student 6: ")
    val student6 = readln()!!.toInt()
    print("Age of Student 7: ")
    val student7 = readln()!!.toInt()
    print("Age of Student 8: ")
    val student8 = readln()!!.toInt()
    print("Age of Student 9: ")
    val student9 = readln()!!.toInt()
    print("Age of Student 10: ")
    val student10 = readln()!!.toInt()

    val avg = ((student1 + student2 + student3 + student4 + student5 + student6 + student7 + student8 + student9 + student10) / 10).toDouble()
    println("The average of the student is: $avg ")
    println("=================================")

    // A story to tell (Concatenating Strings)
    val hero = "Grageron"
    val mage = "Annie"
    val warrior = "Great Fernando"
    val rogue = "Shiela"
    val king = "King Thalion"

    val sword = "Blade of Eternity"
    val staff = "Staff of Arcanus"

    val potion = "Elixir of Shadows"
    val shield = "Aegis of the Forgotten"

    val spell = "Inferno Nova"
    val ability = "Shadowstrike"

    val story = """
        In the ancient kingdom of Eldoria, the fearless hero $hero set forth on a perilous quest. Alongside him traveled 
        $mage, the wise mage, wielding the $staff, and $warrior, a mighty warrior, with his enchanted $sword. They had 
        sworn an oath to protect the realm from the malevolent sorcerer, Lord Draven.

        At the crossroads, they were joined by $rogue, a master of stealth and deception. She carried the $potion, a rare 
        and powerful artifact capable of turning the tide in battle. Together, they ventured deep into the forbidden forests 
        of Galdoria.

        With $king himself calling upon their aid, they were tasked with recovering the fabled $shield, the $shield, lost 
        in the depths of the haunted ruins of Eldroth. But danger lurked at every turn. As they entered the final chamber, 
        the sorcerer's dark magic struck them. 

        Lyra cast the powerful $spell, but the magic was not enough. It was Kara’s $ability that turned the battle. With a 
        swift $ability, she felled the sorcerer’s guardians, clearing the path for Aelion to strike the final blow. 

        Peace returned to Eldoria, but the memory of the journey would be told for generations.
    """.trimIndent()

    println(story)

}