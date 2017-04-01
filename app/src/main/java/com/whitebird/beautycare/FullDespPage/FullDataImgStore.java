package com.whitebird.beautycare.FullDespPage;

import com.whitebird.beautycare.R;

import java.util.ArrayList;

/**
 * Created by girish on 14/2/17.
 */

class FullDataImgStore {

    private String getNameForFullDesp;
    private String integerFullImageList[] = {
            "main_beauty_parlour",
            "home_beauty_parlour",
            "face",
            "nails_design",
            "mehndi_design"
    };
    private String n = "<br/>";
    private String stringFullImgNameList[] = {
            "<b>"+"Technique"+"</b>"+n+"hello",
            "<b><h1>Technique</h1></b>"+n+n+
                    "<p>In threading, a thin (cotton or polyester) thread is doubled, then twisted. It is then rolled over areas of unwanted hair, plucking the hair at the follicle level. Unlike tweezing, where single hairs are pulled out one at a time, threading can remove short rows of hair.\n" +
                    "\n" +
                    "Advantages cited for eyebrow threading, as opposed to eyebrow waxing, are that it provides more precise control in shaping eyebrows and is gentler on the skin. It can be painful as several hairs are removed at once: however this can be minimized if it is done correctly.\n" +
                    "\n" +
                    "There are a few different techniques for threading. These include the hand method, mouth method and neck. Each technique has advantages and disadvantages; however, the mouth holding method is the fastest and most precise.\n" +
                    "\n" +
                    "Threading allows for a more defined and precise shape and can create better definition for eyebrows. It is also used as a method of removing unwanted hair on the entire face and upper lip area. Threading is not a good method for removing hair on arms or legs, as the hair in those regions is typically quite coarse and there is too much to remove.</p>",
            "Beauty Care",
            "Nails Design",
            "Mehndi Design"
    };

    //Info For Threading
    private String imgThreading[]={
            "threading_technique",
            "threading_step1",
            "threading_step2",
            "threading_step3",
            "threading_step4",
            "threading_step5",
            "threading_step6"
    };
    private String txtThreading[]={
            "<b><h1>Technique</h1></b>"+n+
                    "<p>In threading, a thin (cotton or polyester) thread is doubled, then twisted. It is then rolled over areas of unwanted hair, plucking the hair at the follicle level. Unlike tweezing, where single hairs are pulled out one at a time, threading can remove short rows of hair.\n" +
                    "\n" +
                    "Advantages cited for eyebrow threading, as opposed to eyebrow waxing, are that it provides more precise control in shaping eyebrows and is gentler on the skin. It can be painful as several hairs are removed at once: however this can be minimized if it is done correctly.\n" +
                    "\n" +
                    "There are a few different techniques for threading. These include the hand method, mouth method and neck. Each technique has advantages and disadvantages; however, the mouth holding method is the fastest and most precise.\n" +
                    "\n" +
                    "Threading allows for a more defined and precise shape and can create better definition for eyebrows. It is also used as a method of removing unwanted hair on the entire face and upper lip area. Threading is not a good method for removing hair on arms or legs, as the hair in those regions is typically quite coarse and there is too much to remove." +
                    "</p>"+n+n+n+"",
            //Prepare Kit For Threading
            "<b><h2>Step 1</h2></b>"+n+
                    "<p><b>Prepare:</b>" +
                    "1.\n" +
                    "Get sewing thread. To thread your eyebrows, you will need high-cotton sewing thread. Measure out a piece of thread that is as long as your forearm, plus three inches. It should be around 14 inches or 35 cm long.\n" +
                    "Using high-cotton sewing thread will ensure your eyebrow hairs do not snap off between the thread. High-cotton thread tends to grip hair better than synthetic thread.\n" +
                    "Thread is the best thing to use for threading. Do not use floss or string as this will not be as effective as thread." +n+n+
                    "2.\n" +
                    "Find small eyebrow scissors. You will use the eyebrow scissors to trim your eyebrows before you thread them. You can also use small hair shears or small sewing scissors. You want scissors that will be small enough to trim your brows and sharp enough to get at the hairs." +n+n+
                    "3.\n" +
                    "Get an eyebrow brush. You will use the brush on your brows to prepare them for the threading. You can use a standard eyebrow brush or a fine toothed hair comb. Make sure the brush or comb is clean as you do not want to get bacteria or dirt in your brows before you thread them." +n+n+
                    "4.\n" +
                    "Find an eyebrow pencil. You will use the pencil to draw the shape you want for your eyebrows. This will help to guide you as you thread your eyebrows. Go for an eyebrow pencil that is the same shade as your brows or slightly darker than your brows.\n" +
                    "You should also check that the eyebrow pencil will wash off with water or makeup remover so you can get rid of the outline once you are done threading your eyebrows." +n+n+
                    "5.\n" +
                    "Get aloe vera gel or an ice pack. You will use the aloe vera or the ice pack to soothe your brows after you are done threading them. The aloe vera or ice pack will also help with any redness or irritation that develops due to the threading. You can use aloe vera from a bottle or a standard ice pack, wrapped in a clean towel." +
                    "</p>"+n+n+n+"",
            //Shape Your Eyebrows
            "<b><h2>Step 2</h2></b>"+n+
                    "<p><b>Shape Your Eyebrows:</b>" +n+
                    "1.\n" +
                    "Determine where your inner brow should end. Hold a straight edge, such as an eyebrow pencil or a ruler, vertically in front of your face.\n" +
                    "If you want your eyebrows farther apart, line it up so that it touches the outermost of edge your nose and the inside of your eye. If you want your eyebrows closer together, line up the straight edge with one side of the septum. These lines will determine where your eyebrow should start.\n" +
                    "Mark that spot with an eyebrow pencil. Repeat for the other eye." +n+n+
                    "2.\n" +
                    "Determine where your arch should peak. Angle the straight edge so that it lines up with the outermost edge of your nose and the outermost edge of your pupil.\n" +
                    "It's very important that you look straight ahead — both your face and your eyes should be looking directly forward at the mirror.\n" +
                    "Wherever the line intersects your eyebrow is where the peak of your arch should begin at the top border of the eyebrow.\n" +
                    "Mark that spot with your eyebrow pencil.\n" +
                    "Repeat for the other eye." +n+n+
                    "3.\n" +
                    "Determine where your outer brow should end. Angle the straight edge further so that it touches the outermost edge of your nose and also passes along the outermost edge of your eye.\n" +
                    "This tells you where the eyebrow should end. Mark this point with your eyebrow pencil.\n" +
                    "Repeat with the other eye." +n+n+
                    "4.\n" +
                    "Draw a line along the bottom edge of your brow. This will determine the brow thickness.\n" +
                    "Follow the natural curvature of your eyebrow." +n+n+
                    "5.\n" +
                    "Pluck the strays that fall below the line and outside the marks you've made.\n" +
                    "Your eyebrows should be 1/4 – /1/2 inch (0.5 – 1 cm) at their thickest.[1]\n" +
                    "Pluck minimally above the brow — you want to retain your brow's natural arch. Only tweeze stray hairs.\n" +
                    "If plucking isn't your thing, try shaping without it.\n" +
                    "If your brows are sensitive, use ice to numb the areas before you tweeze." +n+n+
                    "6.\n" +
                    "Consider your face shape. Certain brows better compliment specific face shapes.\n" +
                    "To minimize the curve of a round face, direct the outer third of the brow towards the top of the ear.\n" +
                    "If the face is square, direct it toward the middle of the ear. This helps balance the face.\n" +
                    "If the face is long, keep the brow more straight across, directing it above the ear.\n" +
                    "An oval face already looks balanced, but to enhance this harmony, you can direct the outer third towards the ear lobe." +
                    "</p>"+n+n+n+"",
            //Trim Your Eyebrows
            "<b><h2>Step 3</h2></b>"+n+
                    "<p><b>Trim Your Eyebrows:</b>" +n+
                    "1.\n" +
                    "Trim your brows. You may find that hairs are within your ideal shape, but are just too long. Use a pair of eyebrow trimmers to clean up your look.\n" +
                    "Using a brow brush, brush the hairs upward.\n" +
                    "Cut the hairs that extend beyond your natural hairline." +n+n+
                    "2.\n" +
                    "Fill in sparse spots. If your brows are too light (or dark), fill them in with an eyebrow pencil. If you don't have an eyebrow pencil, substitute matte eyeshadow.\n" +
                    "If your brows are fair, choose a pencil two shades darker than your hair. (If you have dark hair, go two shades lighter.)\n" +
                    "Hold your skin taut at the temple, and line softly along the upper edge of your brow. Then, line along the bottom edge.\n" +
                    "With feathery strokes, fill in between the two edges.\n" +
                    "Remember to blend!" +n+n+
                    "3.\n" +
                    "Use a clear gel to set. Brush the hairs how they naturally lie and apply gel to set the hairs in place.\n" +
                    "Clear mascara can double as a brow gel.\n" +
                    "This also prevents smudging, if filled in." +n+n+
                    "4.\n" +
                    "Develop a routine. Forming good habits will make your routine shorter, day by day.\n" +
                    "By sticking to a specific contoured shape, spotting strays becomes easy.\n" +
                    "Consistently pluck between the brows and at the edges. These hairs grow the fastest and take away from the natural shape of your brows." +n+
                    "</p>"+n+n+n+"",
            //Prepare thread
            "<b><h2>Step 4</h2></b>"+n+
                    "<p><b>Prepare Thread:</b>" +
                    "1.\n" +
                    "Take the thread and tie it to form a loop. Hold the thread against your forearm and make sure it is long enough. Then, tie the two ends together to form a loop. Make sure the thread is tightly knotted together. Trim off any loose ends so you have a clean loop of thread." +n+n+
                    "2.\n" +
                    "Twist the loop four to five times. Hold one end of the loop with your thumb and forefinger. Let the other end hang motionless between your other thumb and forefinger. Twist the loop four to five times while holding one end of the loop with your thumb and forefinger.\n" +
                    "You should eventually have a twisted section in the middle of the loop with the loop taunt between your thumb and forefinger on each hand. It will look like an hourglass or bow tie shape." +n+n+
                    "3.\n" +
                    "Practice opening one hand and closing the other hand with the loop. Before you start threading your eyebrows, practice the threading motion with your hands. Open one hand with your thumb and forefinger positioned in the loop. Then, close the other hand. The loop’s center twist should move back and forth as you increase and decrease the distance between your thumbs and forefinger. This twisting motion will be what you will use to remove your eyebrow hairs.\n" +
                    "You may need to practice this motion several times to get the hang of it. If you find the loop is too hard to control, you may try making a new loop that is shorter in length. You may find a shorter thread loop is easier to manipulate between your fingers.\n" +
                    "You can also use your other fingers to help gain control of the loop. You can use the middle finger and ring finger of your dominant hand in addition to your thumb and forefinger to help you get the hang of manipulating the twisted center of the loop." +n+n+
                    "</p>"+n+n+n+"",
            //Begin Threading
            "<b><h2>Step 5</h2></b>"+n+
                    "<p><b>Begin Threading:</b>" +
                    "1.\n" +
                    "Position the twisted center over your eyebrow. Make sure you position the twisted center over your eyebrow, directly over the hairs you want to remove. Your fingers should be firmly positioned in the loop with your thumb and forefinger on one end and your thumb and forefinger on the other end.\n" +n+n+
                    "2.\n" +
                    "Close the hand controlling the twisted center. As you do this, open your other hand. Slide the twisted center against your skin slowly and firmly. The corners of the twisted center will grab your hairs and remove them as you open and close your hands.\n" +
                    "Always thread your eyebrow hairs in the opposite direction of their growth. This will ensure the hair comes out easily and reduces your risk of developing ingrown hairs.\n" +
                    "Do not tug too hard on your skin or press the twisted center too deep into your skin as this can lead to irritation and pain. Instead, glide the twisted center across your skin to remove the hairs." +n+n+
                    "3.\n" +
                    "Continue to thread the rest of your eyebrow hairs. Once you finish one stroke and remove a section of hair, place the twisted center back to the starting position and do another stroke, removing another section of hair. Make sure you also remove any hair between your eyebrows with the thread, making sure you move the thread in the opposite direction of the hair’s growth.\n" +
                    "You can remove a small amount of hair or a larger amount of hair depending on how quickly you glide the twisted center over the hair. You may start with a slow glide until you get the hang of the movements and can move more quickly." +n+n+
                    "</p>"+n+n+n+"",
            //Soothe any irritated skin
            "<b><h2>Step 6</h2></b>"+n+
                    "<p><b>Soothe any irritated skin:</b>" +
                    "1.\n" +
                    "Put aloe vera or an ice pack on your threaded eyebrows. Once you finish threading both eyebrows, you may have some redness or irritation on your skin. Place some aloe vera or an ice pack wrapped in a towel over your brows to soothe them. The redness around your eyebrows should go away after about an hour.\n" +
                    "After an hour, you should examine your eyebrows and check for any stray hairs you may have missed. You may use the threading to remove the stray hairs or pluck them out.\n" +
                    "You can also fill in any gaps in your eyebrows with an eyebrow pencil to make them look fuller and more uniform." +
                    "</p>"+n+n+n+""
    };

    private String imgWaxing[] = {
            "waxx_how_to_wax_your_leg",
            "waxx_prepare_hand_for_waxing",
            "waxx_prepare_for_bikini_wax",
            "waxx_armpit_waxing",
            "waxx_facial_waxing"
    };
    private String txtWaxing[] = {
            //How to Wax your leg
            "<b><h1>How to wax your leg</h1></b>"+n+
                    "<p><b>Step 1</b>" +n+
                    "To make sugar wax Or you can buy any wax:" +n+
                    "1.\n" +
                    "Make the sugar wax. Combine sugar, lemon juice, and water into a saucepan and heat on low. Make sure it doesn't boil over. You’ll need to use a food thermometer to measure the temperature of the mix. It is done when the thermometer reads 250 F. " +n+n+
                    "2.\n" +
                    "Remove pot from heat and leave to cool. You should leave it for at least half an hour before you do anything else with it. Definitely do not apply the mixture to your legs yet! That will hurt." +n+n+
                    "3.\n" +
                    "Transfer the wax into the jar or container. If you aren’t going to use it immediately that’s okay, but when you do want to use it make sure you put in microwave without the lid for 30-40 seconds or until the wax resembles a honey like state. If it becomes solid it’s much harder to spread out over your legs." +n+n+
                    "4.\n" +
                    "Test a small amount of the wax on your skin to see if you have an allergic reaction or sensitivity. Apply a little cooled wax to your body to test for a rash or redness. If there is none then you can continue" +n+n+
                    "5.\n" +
                    "Wash your legs in warm water to relax the hairs. Pat off the water and apply baby powder. This isn’t necessary but it could help with the process and make your legs less sensitive." +n+n+
                    "6.\n" +
                    "Check your legs to see in which direction your hair is growing. See if the hair is growing all in one direction or in different patches. You are going to have to apply the wax and waxing strip in the direction of your hair growth." +n+n+
                    "7.\n" +
                    "Test the temperature of the wax by applying a little to your hand. If it feels warm, let it cool a bit more. An easy way to test when to use it is to stir it - if its too runny then chances are you must wait more." +n+n+
                    "8.\n" +
                    "Apply a thin layer to your legs with the spatula in the direction of your hair growth. Only do this after it is sufficiently cooled. When you spread the wax in the direction of hair growth the hair should lay flat and smooth with no hairs poking up." +n+n+
                    "9.\n" +
                    "Apply the strip of cloth and rub/massage the strip on to the wax covered part of your leg. Rubbing it up and down is the best way. Now wait for wax to set or until you feel resistance when you try pulling the strip up." +n+n+
                    "10.\n" +
                    "Grab the strip by the end piece and then pull the strip away in the opposite direction of hair growth. Pull the skin taut by holding down on any loose skin with your hands before you do this. Do it as quickly as possible and in one clean piece. When pulled away properly, there should be little to moderate discomfort." +n+n+
                    "11.\n" +
                    "Repeat until your entire leg is hair free. Hopefully the process doesn’t take too long, but make sure that you are being thorough. There’s nothing worse than checking to see you missed a spot a few days later. Pull the skin taut by holding down on any loose skin with your hands." +n+n+
                    "12.\n" +
                    "Wash your legs with cold water, never with hot or warm water. Pat dry and apply generous amounts of moisturizer to relax your skin. Good job, you’ve waxed your legs using sugar wax!" +n+n+n+n+n+
                    "</p>",
            //How to prepare your hand for waxing
            "<b><h1>How to prepare hand for waxing</h1></b>"+n+
                    "<p><b>Step 1</b>" +n+
                    "1. Check for irritation,sunburn or breakouts." +
                    "If you find areas that are distressed,treat them and wait until they" +
                    "are healed before waxing" +n+
                    "2.Take note of moles and lesions." +
                    "Do not wax over moles,skin tags,or lesions as they could rip off during the" +
                    "waxing procedure.Put a small band-aid over them as a reminder, and be sure to" +
                    "point them out to your aestheticism before waxing begins" +n+
                    "3.Check the length of your hair." +
                    "The best length for waxing is generally 1/2 to 3/4 of an inch (13-19mm)." +
                    "For very fine hair, like women's facial hair, it can be a little shorter" +n+n+
                    "<p><b>Step 2</b>" +n+
                    "1.Cleanse: Use a gentle soap to clean the area you want to wax." +
                    "Avoid Using very hot water as this may irritate your skin." +n+
                    "2.Exfoliate: Use a loofah,exfoliating cream or washcloth and rub in " +
                    "circular motions. You want to remove any dead skins cells that may clog" +
                    "the hair follicle and cause ingrown hairs. Avoid irritating your skin by rubbing to hard" +n+
                    "3.Hydrate: Soak the area to be waxed with the warm water for 5 to 10 min." +
                    "This hydrates the skin and the hair making removal easier." +n+
                    "4.Moisturize: Use a water-based, or oil free moisturize after you hydrate." +
                    "Oil free moisturize helps prevent your skin from burning or abrading during waxing." +
                    "Some companies that make waxing products,sell a pre-wax moisturizer made to prepare the skin for waxing." +
                    "Just be sure the moisturize you use absorbs into the skin and does not leave a residue." +
                    "Oil or lubricant on skin will prevent the wax from grabbing the hairs" +n+n+
                    "<p><b>Step 3</b>" +n+
                    "1." +
                    "Avoid waxing when skin is more sensitive. It's best not to wax when your skin has had a lot of sun exposure, when you are menstruating, or when you have used aggressive skin care products (such as AHA or retinoid treatments). Give your skin about a week after any of these before you wax." +
                    "2." +
                    "Consider a pain reliever. Taking an oral anti-inflammatory about an hour before waxing will not only keep the skin from swelling, but it will also alleviate some of the pain associated with waxing. This is optional and at your discretion. Some salons also sell topical pain relievers that you can spray or rub onto the skin. These take a minimum of 15 minutes to start working. If they are oily at all, you will need to cleanse your skin again before waxing." +n+n+n+n+n+
                    "</p>",
            //How to do a Bikini Waxing
            "<b><h1>How to do a Bikini Waxing</h1></b>"+n+"" +
                    "<p><b>About Bikini Waxing</b>" +n+
                    "Bikini waxing is the removal of pubic hair using a special wax, which can be hot or cold, that adheres to hairs and pulls them out when the wax is removed quickly from the skin, usually with a cloth strip. While the practice is mainly associated with women, men remove pubic hair at times as well.\n" +
                    "\n" +n+
                    "A bikini line is the area of the upper leg and inner thigh where pubic hair grows that normally is not covered by the bottom part of a swimsuit. In some cultures, visible pubic hair in this region is disapproved of and/or considered embarrassing, so it is sometimes removed. However, some people remove pubic hair that will not be exposed for aesthetic purposes, personal grooming and hygiene, culture, fashion or other reasons." +n+n+
                    "</p>" +
                    "<p><b>Technique</b>" +n+
                    "Pubic hair can be removed in a number of ways, such as waxing, shaving, sugaring, electrolysis, laser hair removal or with chemical creams. Waxing involves applying melted, usually hot, wax to the pubic hair that an individual would like to remove. The wax, which adheres to the hair as it hardens, is then covered with small strips of cloth. When the wax hardens sufficiently, the cloth is pulled off quickly, removing the hair from its roots as the wax is pulled away. Waxing can be performed on oneself privately using a home kit or by a cosmetologist at a salon or spa." +n+n+
                    "</p>" +
                    "<p><b>Before Getting Wax</b>" +n+
                    "If a person has never been waxed before, or has not been waxed for a long time, it may be necessary to trim the pubic hair using scissors or an electric razor prior to waxing. A patch test is recommended, usually on the upper thigh, to test for allergies or skin sensitivities to the ingredients in the wax." +n+n+
                    "</p>" +
                    "<p><b>Step 1</b>" +n+
                    "Buy the correct wax. Your bikini area has very sensitive skin and very coarse hair. This means waxing the area can be very painful. Choosing the wrong wax could lead to more pain than what is necessary. There are different types waxes that have different benefits and disadvantages, but for avoiding pain, hard wax is your best choice. It does not grab any skin and is best for the coarse hair you have in your bikini area.\n" +
                    "Cold wax strips are warmed up in your hands and are great to avoid mess. But sometimes you need to go over spots more than once to remove all the hair, so it is not recommended for avoiding pain.\n" +
                    "Soft wax is put on with paper strips and is better for finer hair. It is best for large, non-sensitive areas so it is not recommended for your bikini area." +n+n+
                    "</p>" +
                    "<p><b>Step 2</b>" +n+
                    "Make sure your hair is the correct length. It is important not to try to wax if your hair is too short or too long. Your hair should be about ¼ inch when you wax. If your hair is too short, there will not be enough hair for the wax to grab. If your hair is too long, the wax will grab too much hair. The long hair will also be coming from various directions, causing more pain. If your hair is too long you can trim it with an electric razor." +n+n+
                    "</p>"+
                    "<p><b>Step 3</b>" +n+
                    "Create a waxing schedule. You should wax every three to four weeks. If you go longer than that, your hair will be too long and waxing will be more painful. Staying on a strict waxing cycle gets your hair used to the pain and builds tolerance.\n" +
                    "Don’t wax before your period. This is when you are the most sensitive to pain." +n+n+
                    "</p>"+
                    "<p><b>Step 4</b>" +n+
                    "Don’t bother with numbing creams. Purchasing creams that promise to take away the pain are just a waste of money. As nice as it would be to be able to numb your bikini area ahead of time to prevent pain, they don’t actually work and the waxing is still just as painful.\n" +
                    "Put baby powder on your bikini area beforehand instead. This will help remove moisture so the wax can grab the hair easier.\n" +
                    "About 20-45 minutes before you wax, take an ibuprofen to help lessen the pain." +n+n+
                    "</p>"+
                    "<p><b>Step 5</b>" +n+
                    "Undress and clean the area with soap and water. Before you start, take a shower and wash your bikini area with unscented soap and warm water. Make sure you are completely dry before you start waxing. Stay undressed, it will be easier to wax without underwear or clothes getting in the way." +n+n+
                    "</p>"+
                    "<p><b>Step 6</b>" +n+
                    "Heat the wax. You can heat the hot wax in a wax warmer or in the microwave. A wax warmer keeps the wax warm throughout the process, prevents the wax from getting too hot, and is less messy. If you don’t want to purchase a wax warmer, you can just use your microwave." +n+n+
                    "</p>"+
                    "<p><b>Step 7</b>" +n+
                    "Find a comfortable environment. Don’t try to wax in the living room or a shared space of your house. Go somewhere you can be completely alone and are comfortable. Wait until everyone is gone so there is no chance of someone walking in on you. You want to be able to take your time and be able to relax while you work.\n" +
                    "You can wax on your bed or on your floor (with a towel laid down) so you are comfortable.\n" +
                    "Have a mirror in front of you so you can see what you are doing." +n+n+
                    "</p>"+
                    "<p><b>Step 8</b>" +n+
                    "Test the wax. Make sure you test the wax before you start applying. If the wax is too hot you can burn yourself. Take a wax applicator stick and stir the pot of wax. Scrape off any extra wax and dab the inside of your wrist to check the heat." +n+n+
                    "</p>"+
                    "<p><b>Step 9</b>" +n+
                    "Decide how you want to look. There are many options for bikini area looks. You can wax your bikini line (the area that shows when you have a swimsuit on), you can create a shape (landing strip, triangle, and heart are the most common), or you can do a Brazilian wax and remove everything.\n" +
                    "If you want to create a shape, you can purchase stencils or use a bright lip liner to outline the area you don’t want to wax." +n+n+
                    "</p>"+
                    "<p><b>Step 10</b>" +n+
                    "Start waxing. Carefully smear the wax in one section (about an inch wide and up to three inches long). Make sure to put the wax on in the direction of your hair growth. Wait for 30 seconds for the wax to harden then pull off the wax in the opposite direction of your hair growth. Since it is hot wax, you can directly pull the wax without paper.\n" +
                    "Start with your inner thigh and work your way in and then back until you are finished waxing.\n" +
                    "Pulling the wax off is the only way to remove it once you apply it.\n" +
                    "Pull your skin tight in the area you are waxing to help with pain." +n+n+
                    "</p>"+
                    "<p><b>Step 11</b>" +n+
                    "Remove extra hair and extra wax. When you are finished, remove any remaining hairs with tweezers. Any small pieces of wax that did not come off can be taken off with wax remover or baby oil." +n+n+
                    "</p>"+
                    "<p><b>Step 12</b>" +n+
                    "Keep your skin smooth. When you are finished waxing, rinse off to help sooth discomfort. When you are rinsed off, exfoliate your bikini area to help prevent uncomfortable ingrown hairs and to keep your bikini area stay soft and smooth. If you get ingrown hairs don’t pop them, they could get infected.\n" +
                    "Use hydrogen peroxide or alcohol free astringent to help prevent infection." +n+n+
                    "</p>"+
                    "<p><b>Step 13</b>" +n+
                    "Soothe your burns. If you burn yourself on the hot wax, get a wash cloth wet with clean, cold water. Press the wash cloth on the burned area for 15 minutes. Put aloe vera gel on the burn to help with the discomfort and inflammation. If the burn blisters or swells go to a doctor." +n+n+
                    "</p>"+
                    "<p><b>Step 14</b>" +n+
                    "Fix any redness. It is possible your bikini area will be very red after you wax. If this happens, microwave milk in a bowl. Soak a wash cloth in the warm milk and press on your bikini area until the redness fades. If you are at home or have privacy, take your underwear off for an hour or two when you are finished. This helps fix any redness. Even if you aren't red, you might want to do this anyway to prevent irritation." +n+n+n+n+n+
                    "</p>",
            //How to do a Armpits Waxing
            "<b><h1>How to do a Armpits Waxing</h1></b>"+n+"" +
                    "<p><b>Step 1</b>"+n+
                    "Prepare your underarms. You can wax your armpits without making a lot of preparations, but if you take these easy measures the experience will be less painful and more effective:\n" +
                    "Clean your underarms thoroughly. Wash them with soap or a good body wash, and scrub them a little to exfoliate the skin.[1] If you use hot water, the hairs and surrounding skin will soften, making the hairs easier to remove.\n" +
                    "Trim the hair. If the hair under your arms is longer than 1⁄4 inch (0.6 cm), you should trim it with a pair of barber or nail scissors until it's 1⁄4 inch (0.6 cm) long. This makes the waxing process less painful." +n+n+
                    "</p>"+
                    "<p><b>Step 2</b>" +n+
                    "Wrap yourself up in an old towel. The wax is bound to spill and create a mess when you try to do it yourself, so it's best to be either naked or wrapped in something you don't mind getting sticky with wax." +n+n+
                    "</p>"+
                    "<p><b>Step 3</b>" +n+
                    "Powder your underarms. Any talcum powder would do. Take a big sponge and spread the talc over the area, making sure to remove the excess powder." +n+n+
                    "</p>"+
                    "<p><b>Step 4</b>"+n+
                    "Heat up body wax. Make sure you use wax that is intended to be used to remove leg and body hair, rather than wax intended for use on the face. Follow the instructions on the package and heat the wax in the microwave or in a wax heater. It's ready to use when it's completely melted and runny.\n" +
                    "If this is your first time waxing, do a test on the back of your hand, where your skin is less sensitive, to make sure the wax isn't too hot.\n" +
                    "Body wax kits are available at drugstores and beauty supply stores.\n" +
                    "You can make your own sugar-based body wax using the following recipe: mix 2 cups of sugar with 1/4 cup water and 1/4 cup lemon juice. Heat the mixture over low heat on the stove until the sugar dissolves and becomes a sticky syrup. The mixture is now ready to use." +n+n+
                    "</p>"+
                    "<p><b>Step 5</b>"+n+
                    "Use a waxing stick to apply wax to your armpit. Load it with a good amount of hot wax, then swipe it on your armpit in the direction of your hair growth. Continue swiping, always in the same direction, until all of the hair is covered with wax.\n" +
                    "Some people have hair that grows in more than one direction. If this is the case with you, you'll have to wax your armpit one section at a time.\n" +
                    "Do not swipe the wax in the opposite direction. Your hair stands to get tangled up and won't pull out cleanly." +n+n+
                    "</p>"+
                    "<p><b>Step 6</b>"+n+
                    "Apply a wax strip. Take one of the paper wax strips that came with your kit. Place it over the area with the wax and swipe it once with your hand, in the direction of your hair growth, to position it in place.\n" +
                    "If you made your own sugar wax, use a clean piece of cotton cloth as a wax strip.\n" +
                    "Leave the edge of the strip free of the wax, so you can grasp it to pull it off.\n" +
                    "If you can't cover all of the wax with one strip, work one at a time." +n+n+
                    "</p>"+
                    "<p><b>Step 7</b>"+n+
                    "Remove the strip. Grasp the strip by the free edge and pull quickly against the direction of your hair growth. The strip, wax, and hair should come right off. Repeat the process with the other armpit.\n" +
                    "If the wax and hair don't come off, you'll have to try again. Use a fresh wax strip.\n" +
                    "If the process is too painful, remove the wax with olive oil and warm water, and plan to shave instead of waxing." +n+n+
                    "</p>"+
                    "<p><b>Step 8</b>"+n+
                    "Examine your armpits in the mirror. If you see bits of remaining hair, apply more wax, smooth on a wax strip, and rip it off." +n+n+
                    "</p>"+
                    "<p><b>Step 9</b>"+n+
                    "Remove excess wax with oil. Use the oil that came with your waxing kit or a bit of olive or almond oil to rub the areas you waxed. The oil will loosen the wax from your skin, making it easy to peel it off without pain." +n+n+
                    "</p>"+
                    "<p><b>Step 10</b>"+n+
                    "Clean the area. Once all of the wax has been removed, wash your armpits with warm water and a mild soap. You can apply aloe if your armpits are still stinging.\n" +
                    "If the waxing caused you to bleed, put on a small bandage until the bleeding has subsided.\n" +
                    "Do not use deodorant, moisturizer, or other creams and lotions for several hours after waxing." +n+n+n+n+
                    "</p>",
            //How to do a Facial Waxing
            "<b><h1>How to do a Facial Waxing</h1></b>"+n+"" +
                    "<p><b>Step 1</b>"+n+
                    "Find a product for your skin. There are special facial skin wax packs or kits available wherever beauty products are sold. Read the ingredients carefully and not what type of skin the product is recommended for. Some waxing kits have quite strong ingredients made for other places and they could cause irritation to your face. For sensitive skin, some packs come with lotion or aloe vera gel for after the wax." +n+n+
                    "</p>"+
                    "<p><b>Step 2</b>"+n+
                    "Decide between a hot or a cold wax. If you have done waxing before you might find that using hot wax is a bit uncomfortable or causes prolonged irritation to your skin. However there are cold waxes on the market as well. Different waxes have different additives, so try experimenting until you find the one that fits your unique skin type." +n+n+
                    "</p>"+
                    "<p><b>Step 3</b>"+n+
                    "Skip shaving at least three weeks ahead of waxing. There needs to be enough hair for the wax to grab. If your facial hair grows quickly, wax as soon as the hair is long enough." +n+n+
                    "</p>"+
                    "<p><b>Step 4</b>"+n+
                    "Exfoliate in the lead up to the waxing. This is to prepare the skin for waxing. Doing this will help deter ingrown hairs. However, do not exfoliate on the day of waxing, as this leaves your skin too vulnerable.\n" +n+n+
                    "</p>"+
                    "<p><b>Step 5</b>"+n+
                    "Clean your face. Don't wear makeup, skin lotions or creams the day of your wax. You can use any cleaners except exfoliating scrubs. Pull your hair back, but make sure you can see your hairline. You don't want to overdo it and end up waxing your hair away." +n+n+
                    "</p>"+
                    "<p><b>Step 6</b>"+n+
                    "Trim facial hairs as needed.\n" +
                    "If you are male, trim your facial hairs that are longer than the length of your pinky fingernail (about 1/6th to 1/8th of an inch). This includes your sideburns and mustaches.\n" +
                    "For women, if you are waxing your eyebrows, trim the pieces of hair you want to get rid of. The more you trim away now, the less pain you'll have removing it later." +n+n+
                    "</p>"+
                    "<p><b>Step 7</b>"+n+
                    "Follow the instructions of your wax kit. If you're using hot wax, heat it. Some require you to melt it in the microwave or stove top. The microwave is not recommended if you have a choice of methods because this can overheat the wax." +n+n+
                    "</p>"+
                    "<p><b>Step 8</b>"+n+
                    "Test the wax to see whether it's too hot, if using hot wax. To do so, put a small dab on the inside of your elbow or wrist. If it is too hot, wait for it to cool. Does it turn solid? Try reheating it a different way.\n" +
                    "If it causes an adverse reactions, do not continue using the wax. It's not right for your skin." +n+n+
                    "</p>"+
                    "<p><b>Step 9</b>"+n+
                    "Apply the wax. Using a small comb or spatula that comes with the wax, apply the wax in the direction of the hair growth. Put just enough on so you can peel it but not too much because you don't want to overdo it.\n" +
                    "If the pack came with a small cloth strip, apply it immediately, smoothing it out to make sure it lies flat on your skin. If you don't get it on quickly enough, the wax could dry and you'll have trouble while you're painfully removing the wax." +n+n+
                    "</p>"+
                    "<p><b>Step 10</b>"+n+
                    "Wait anywhere from 30 seconds to 5 minutes, as directed by the instructions on the kit or packet. Hold the end of the strip or wax, and quickly rip it off in the direction of your hair growth." +n+n+
                    "</p>"+
                    "<p><b>Step 11</b>"+n+
                    "Make sure to wait a full day before using any exfoliating scrubs, astringents, or makeup. Don't go outside in the extreme heat or sunlight. Use sunblock if you really have to go out.\n" +
                    "Apply a sensitive skin moisturizing lotion to your face after you have finished waxing. The redness should go away in a few hours." +n+n+n+n+
                    "</p>"
    };


    private String imgPedicure[] = {
            "pedicure_about",
            "pedicure_supplies",
            "pedicure_start",
            "pedicure_end"
    };

    private String txtPedicure[] = {
            //About pedicure
            "<h1><b>About Pedicure</h1></b>" +
                    "<p>" +
                    "A pedicure is a cosmetic treatment of the feet and toenails, analogous to a manicure. Pedicures are done for cosmetic, therapeutic, and medical purposes and can help prevent nail diseases and nail disorders. They are popular throughout the world, especially among women.\n" +
                    "\n" +
                    "Pedicures include care not only for toenails; dead skin cells are rubbed off the bottom of the feet, using a rough stone (often a pumice stone) or other material. Skin care is often provided up to the knee, including granular exfoliation, moisturizing, and massage.\n" +
                    "\n" +
                    "The word pedicure is derived from the Latin words pedis, which means \"of the foot\", and cura, which means \"care\".\n" +
                    "\n" +n+n+n+n+
                    "</p>",
            //Supplies Need For Pedicure
            "<h1><b>Supplies Need For Pedicure</h1></b>" +
                    "<p>" +
                    "Pick up your supplies. For a good quality pedicure, you’ll need some basic toe-tampering supplies. Grab a tub and water for soaking, nail clippers, a nail file, a cuticle stick/orange stick, a nail buffer, a pumice stone or scrubbing brush, a clear top and base coat, and a polish color of choice. Optional additional supplies include bath salts for soaking your feet, cuticle trimmers, cuticle oil, and lotion for a massage afterwards." +n+n+n+n+
                    "</p>",
            //For Pedicure Start
            "<h1><b>For Pedicure Part1</h1></b>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Remove any pre-existing nail polish. Although it may seem obvious, taking off your old nail polish is an important first step to giving yourself a pedicure. It’ll be hard to add a new color over the top of an old one! Use an acetone remover, making sure to get the bits along your cuticles as well." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Start your soak. Fill a tub or basin with hot water, and if you’d like, a bit of bath salts or oils. Now it’s time to sit back and relax! Let your feet soak for 10 minutes; the hot water will soften tough calluses and remove the dirt and grime that might have built up. It will also help to soften your nails and cuticles, which is critical when you’re prepping to paint your toes." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Cut and file your nails. Start by trimming your nails down to size; use a pair of nail clippers to cut your toenails to be just short enough to see a bit of white at the tips. The shape of the nail should be slightly squared, following the natural topline of your toes. Use your nail file to buff down the sharp edges of nail the clippers might have left, and to do any further shaping you would like.\n" +
                    "Avoid cutting your nails in a rounded shape, as this can promote ingrown toenails.\n" +
                    "If you’re able, try filing your nails in the same direction to avoid splitting the layers and damaging your nails." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Prepare your cuticles. Although this step is optional, it can go a long way in making your toes better prepared for painting. Use your orange stick/cuticle stick to gently push back the cuticle around each nail. If you have cuticle trimmers, gently cut away the excess cuticle skin that builds up over time. Rub on a little cuticle oil when you’re finished to supplement the sensitive skin with a bit of added moisture." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Smooth out the tops of your nails. Use your buffing pad to file down the ridges and rough edges on the tops of your nails. Pay particular attention to the edges that you’ve just trimmed or filed, as this area typically needs to be beveled a bit to create a level plane, so to speak. Use your buffing pad in the same direction and tilt the angle of it to reach the entirety of each toenail." +n+n+n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Clean up and soften your skin. Now it’s time to move onto your actual feet. Use your pumice stone to scrub down the calluses on the heel and ball of your foot. You shouldn't scrub too roughly in these areas because too much irritation causes the skin to respond by thickening to protect the delicate tissue underneath, and that becomes an endless cycle so gentle buffing on the surface with little or no pressure is best. When you’ve removed any dried skin or calluses, you can use a scrubbing brush to clean up your entire foot. Use the brush between your toes and all over the bridge of your foot, adding soap if you’d like a bit of an extra clean.\n" +
                    "Be sure to rinse off your feet with a bit of water after scrubbing.\n" +
                    "Avoid using a ‘cheese grater’ type tool on your calluses, as these have proven to be dangerous and can cause fungal infections." +n+n+n+n+
                    "</p>"+
                    "",
            //For Pedicure end
            "<h1><b>For Pedicure Part2</h1></b>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Finish preparing for polish. Remove your feet from the soaking tub completely and empty it out. Dry your feet off, and if you’d like, massage on a layer of lotion into your skin. If you choose to do this, use a bit of nail polish remover to clean up your nails again (the lotion can keep polish from sticking)." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Add your base coat. Use a clear nail polish as a protective base coat on all your toenails. This will prevent your nail polish from yellowing your toenails, as well as give your lacquer a solid base to stick to." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Apply your color of choice. Select a nail polish color, and paint each of your toenails. Start in the center of the nail near the cuticle, and use long brushstrokes towards the tip of each nail to fill in the color. Work from the center outwards until all your nails are filled in, using a fingernail or the edge of an orange stick to wipe off any polish that might have mistakenly gotten on your skin. You may need to add two coats of polish in order to get an opaque layer of color." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Finish your nails. Wait a few minutes for your polish to begin to dry, and add a clear top coat. This will set your polish in place, and help it to last longer without chipping. Then, protect your feet for 10-15 minutes while the polish completely dries. Test the polish with your finger to see if it is still tacky; when it is totally smooth to the touch and doesn’t smear under pressure, you’re finished! Go show off your cute new toes, and relish your soft new feet." +n+n+n+n+
                    "</p>"+
                    ""
    };

    private String imgManicure[] = {
            "manicure_about",
            "manicure_supplies",
            "manicure_part1",
            "manicure_part2"
    };

    private String txtManicure[] = {
            //About Manicure
            "<h1><b>About Manicure</h1></b>" +
                    "<p>" +
                    "A manicure is a cosmetic beauty treatment for the fingernails and hands, performed at home or in a nail salon. A manicure consists of filing and shaping of the free edge, pushing (with a cuticle pusher) and clipping (with cuticle nippers) any nonliving tissue (limited to cuticle and hangnails), treatments, massage of the hand, and the application of fingernail polish. When applied to the toenails and feet, this treatment is referred to as a pedicure.\n" +
                    "\n" +
                    "Some manicures can include the painting of pictures or designs on the nails, or applying small decals or imitation jewels. Other nail treatments may include the application of artificial nail gel nails, tips, or acrylics, some of which are referred to as French manicures." +n+n+n+n+
                    "</p>",
            //Supplies Need For Manicure
            "<h1><b>Supplies Need For Pedicure</h1></b>" +
                    "<p>" +
                    "Get your supplies together. To give yourself a gorgeous manicure, make sure you have all the right supplies. You might have to spend a bit up front, but next time you want to paint your nails, you'll already be covered. Get the following products:\n" +
                    "Nail polish remover,\n" +
                    "Cotton balls or cotton swabs,\n" +
                    "Cuticle trimmer,\n" +
                    "Nail buffer,\n" +
                    "Nail trimmers,\n" +
                    "Nail file,\n" +
                    "Cuticle or hand cream,\n" +
                    "Nail polish,\n" +
                    "Base coat,\n" +
                    "Top coat," +
                    "</p>",
            //For Manicure Start
            "<h1><b>For Manicure Part1</h1></b>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Set up your workspace. Nail polish and remover can damage many surfaces such as cloth, wood finish and plastic. Wear an expendable t-shirt and no valuable accessories, sit at a desk or table, and protect it with scrap paper (not newsprint, which smudges). Make sure the table itself and anything near it is not particularly valuable or important to keep perfect because there might be a spatter or spill soaking through. You might not want to work near a computer, for instance.\n" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Remove your old nail polish. Use nail polish remover and cotton balls or swabs. Some kinds of nail polish remover may dry the areas on your nails and around them. You may wish to find one that doesn't do this as much, but do not be concerned unless you have a severe allergic reaction.\n" +
                    "If you have and wish to keep fake nails, such as acrylic, choose a polish that will not remove them, and don't let it soak much.\n" +
                    "Unless you use it once a month or less, don't use a nail polish remover with acetone in it. Though acetone will make removing the nail polish easier, it can damage the nails themselves." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Cut and file your nails. Use nail clippers and trim your nails. Don't cut them too short; you should be able to see at least a little of the white tip still, all the way across. Using a nail file, file the nail and create a smooth and clean shape. Gently drag the file across the nail, rather than pushing it. Excessive force or sawing back and forth will weaken the nails and cause them to break. Pivot the hand with the file through each stroke to make a smooth curve rather than angles. Do not file them too short: just clean up any points or roughness left by the clippers.\n" +
                    "If you want to remove fake nails, perhaps because they look odd from having grown out too far, here's how to do that.\n" +
                    "Do not round the corners down into the sides of the nail bed. This can cause the nail to become ingrown. Be particularly careful with the big toe, which, perhaps due to shoes, is more prone to ingrowing." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Buff your nails. Using a white block of a stick-type nail buffer, or a pad-type nail buffer and buffing powder, buff the surface of the nail a little bit to even out the surface and to smooth out ridges. Remember not to buff too much; thinning it too much will weaken it. Perfect edge-to-edge flatness is not practical or necessary. A soft, flexible buffer will more easily buff the sides of the nail along with the middle.\n" +
                    "You may wish to buff your nails after pushing back the cuticles if there is some residue where the cuticles used to cover, in order to scrape or grind it off in the process. Being thin, soft, and not firmly attached, it should come off easily." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Soak your nails. Get a bowl or stopper the sink and fill it with warm (not hot!) water and a few drops of soap. Soak your hands only for a few minutes. The water and soap will help to loosen dirt, dead skin, and any dust left over from filing and buffing, and soften cuticles. Use a nail brush to gently clean your nails and the skin around them. Gently scrape under your nails if necessary to remove dirt. If you want your nails and cuticles really manageable, you can soak them in Dawn dishwasher soap.\n" +
                    "If you have dry skin or fragile nails you should not soak them; just rinse them.\n" +
                    "Don't go overboard with scraping, since you can damage your nails if you remove the white powdery substance that is actually part of your nails." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Prepare your cuticles. Dry your nails and apply a cuticle cream. Using a cuticle pusher, also called an orange stick, gently push back the cuticle. Do not force them back, and never cut your cuticles. Even if the equipment is sterile, removing the cuticle can cause infection and leaves the then-less-protected margin of the skin vulnerable. Wipe off the excess cream with a tissue or towel in the direction that you pushed.\n" +
                    "A small binder clip is great for pushing back cuticles. Make sure it's clean and well-formed, without sharp edges. Fold the wire grips to lay flat against each other. Hold the clip between the thumb and forefinger or middle finger by the flat metal sides, with the grips passing between in the direction of the little finger tip; the flat back piece extending past the thumb and forefinger. Now you're ready to push back the cuticles on the other hand (switch later to do the one currently holding the clip)." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Apply hand cream or lotion. Take a lotion or hand cream and massage it into your hands. If you have very dry skin use an intensive lotion, if not, any lotion will do. Be sure to rub it into and around your nails and let it soak in for 30 minutes or longer.\n" +
                    "This is as well done after painting the nails and allowing them to dry thoroughly as before painting. For very dry skin, apply some greasy lotion and sleep with cheap cotton gloves over your hands to allow it to remain on and work for a long time without keeping you from productive activities.\n" +
                    "Nail polish/lacquer will not stick to nails with moisturizer on them, so take a Q-tip dipped in nail polish remover and quickly wipe the nails to remove the lotion. Wipe excess remover off promptly to mitigate nail damage." +n+n+n+n+
                    "</p>" +
                    "",
            //For Manicure Start
            "<h1><b>For Manicure Part2</h1></b>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Apply the base coat. Cover the nail with a clear base coat or nail hardener. This will even out and ridges and unevenness that may still be on the nail, serve as a primer for the polish, help the polish to last longer, and keep the color from staining your nails.\n" +
                    "This is the point at which you'd apply fake nails if you like.\n" +
                    "Let the coat completely dry before proceeding." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Polish your nails. Pick a nail polish that you really like. Roll the nail polish bottle between your hands for about 10 seconds. Shaking the bottle causes air bubbles in the polish and makes harder for the polish to stick to your nails. Begin painting nails using a thin coat. Dip the brush into the bottle of polish and as you remove it, gently swirl the brush around the inside rim of the bottle to remove excess polish. Slowly paint a vertical stripe down the center of your nail, followed by another stripe on either side of the first. Try to paint all the way to the edge, but it's better to leave a small margin than paint the skin on the side.\n" +
                    "Angle the brush a little forward, press gently so the bristles spread out a little into a neat curve, and drag it gently and smoothly across the nail to paint it. Do not apply a blob of paint to the nail and spread it around. Blobs or runs mean too much paint or painting too slowly; subtle ridges should smooth themselves out under gravity (self-level) but very-thin spots mean too little paint or too much pressure.\n" +
                    "Fancy designs can be difficult, so stick with simple if it's important to get a good result the first time.\n" +
                    "If there is a little bit of nail polish on your fingers or around you nail you can use a toothpick (flat, not round and pointy, is generally best) to get it off if it's still wet. If it's already dry, dip a Q-tip in nail polish remover and wipe it away, or use a nail touch up pen, sold at most drugstores. Be careful not to touch the actual nail with the Q-tip or touch up pen, or you will have to redo that nail." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Let your nails dry. Try not to move your nails too much or the polish may smudge. Wait 10 to 15 minutes for the polish to dry. If you apply a second coat too soon, it will only smudge the first coat. You may be able to speed drying with a fan, but don't be overly optimistic. By blowing the fumes away, the fan will remove one reminder of continuing wetness.\n" +
                    "After the first coat has dried, apply a second coat if you'd like. This ensures the color looks rich and even.\n" +
                    "After the color coats have dried, you may add designs, by brush, airbrush, mask or stencil, decal, rhinestones, or otherwise.\n" +
                    "Skipping the base coat, or even applying only one color coat (depending on the kind of polish and application technique; some give or appear to give more even color with uneven thickness than others), will often give acceptable results. However, extra layers add a little extra to initial surface quality." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Apply the top coat. Finish with a clear top coat for a hard, smooth, scratch-absorbing, chip and flake-resistant shield particularly important for designs that don't cover the entire nail, as well as adding shine. Let it dry completely Have fun and enjoy your newly beautiful nails!" +
                    "See Variations in Nails Section" +n+n+n+n+
                    "</p>" +
                    ""
    };


    private String imgHeadMassage[] = {
            "headmassage_preparation_start",
            "headmassage_shoulder",
            "headmassage_neck",
            "headmassage_hm",
            "headmassage_benefits"
    };

    private String txtHeadMassage[] = {
            //For HeadMassage Starting off
            "<h1><b>HeadMassage Preparation and Starting off</h1></b>" +
                    "<p>" +
                    "Make preparations. Find a quiet place away from any distractions. Make sure the room is a comfortable temperature.\n" +
                    "Put on some soft music\n" +
                    "Light some candles to prepare the room." +
                    "Have the recipient take a seat and get comfortable. Explain what you will be doing, and tell them to notify you of any discomfort or pain. Stand behind, placing your hands lightly on their shoulders as you both take several deep breaths." +
                    "" +n+n+n+n+
                    "</p>",
            //
            "<h1><b>Shoulder Massage</h1></b>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Massage the shoulders. Begin easing away fatigue and tensions with an upper back, shoulders, arms, and neck massage. Squeeze the trapezius muscle (at the base of the neck) gently, starting close to the neck. Work your way outward to the shoulder. Repeat this three times, allowing the pressure to increase with each pass." +n+n+
                    "<b>Step 2</b>" +n+
                    "Work in towards the spine. Bring your hands back up next to the neck with the thumbs extended, and make small circles with the thumbs on either side of the backbone just below the collar line." +n+n+
                    "<b>Step 3</b>" +n+
                    "Massage the tops of the shoulders. Place your forearms at the sides of the neck and roll them outwards toward the shoulder by rotating at the wrists. After rotating, lift your forearms and move them a couple of inches away from the neck and repeat. When you reach the shoulder, come back to center and repeat this process two more times." +
                    "" +n+n+n+n+
                    "</p>",
            //
            "<h1><b>Neck Massage</h1></b>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Work up to the base of the skull. Continue with the circles up the back of the neck until you reach the hairline. Lower your hands back down and repeat two more times." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Massage the neck. Step to one side of your volunteer, and place one hand at the base of the recipient's neck, and your front hand gently on their forehead to keep their head from falling forward. With the rear hand, open your thumb and glide your hand up the back of the neck. Don't put pressure directly on the vertebrae.\n" +
                    "Once you reach the hairline, remain there for a moment with light pressure on the back of the head. Lower your rear hand and repeat from the base of the neck. You can even add some circling to the upward stroke if there seems to be a lot of tension present. Repeat this about five times. When your rear hand reaches the hairline for the last time, let it remain there." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Slowly allow the head to tilt forward without strain or effort. Keep your hand at the recipient's hairline." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Move the head back. Gently lift the head back to vertical and continue backwards, again without forcing, simply allowing the head to move within its own range of motion.\n" +
                    "Repeat this 3 times, forward and backward." +n+n+
                    "</p>" +
                    "" +n+n+n+n+
                    "",
            //
            "<h1><b>Head Massage</h1></b>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Massage the head. Step back behind the recipient and loosen his or her hair if it is restrained. Bring your hands, with fingers spread, to the sides of the head, fingers pointing up. Use a light pressure and slowly move the hands up with a shampooing-like motion, trying to keep the heel of the hands in contact with the scalp as well as the fingers.\n" +
                    "Once you reach the top of the head, allow the fingers to rise off while maintaining a gentle traction from the heels of the hands. Now lower your hands and move them around to a different area of the head. Repeat four or five times, covering the entire scalp." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Rub the scalp. Bring one hand to the volunteer's forehead for stability as you place the heel of the other hand in contact with back of the head. Begin rubbing the scalp by moving your rear hand vigorously back and forth. Continue rubbing as much of the scalp as you can reach, and then switch hands and repeat on the other side." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Briskly rub the scalp all over with just the fingertips of both hands. Continue this for about a minute." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Stroke your fingers through your recipient's hair from the top of the forehead back. Let the final strokes draw their head back slightly and then lay the fingers over the forehead and draw the fingers down and along the brow line to each temple, making small circles over the temples. Repeat this process three times." +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Finish up. With smooth strokes beginning at the forehead, slowly work your way to the back of the head. Do this for about a minute, allowing the pressure to become lighter towards the end, until finally your hands float off the head." +n+n+
                    "</p>" +
                    "" +n+n+n+n+
                    "",
            //
            "<h1><b>Head Massage Benefits</h1></b>" +
                    "<p>" +
                    "Know the benefits. The therapeutic benefits of the Indian head massage are comprehensive, suggesting that you make it a part of your overall health routines. They include:\n" +
                    "Relief from pain and stiffness in the muscles of the face, neck, upper back, and shoulders.\n" +
                    "Increased mobility of the neck joints.\n" +
                    "Relief from tension and hangover headaches, eye strain, TMJ, and nasal congestion\n" +
                    "Renewed energy.\n" +
                    "Reduction of depression, anxiety, and other stress-related issues\n" +
                    "Higher levels of creativity, clarity, and concentration, and better memory.\n" +
                    "A sense of tranquility, calmness, and positive well-being.\n" +
                    "Sound, restful sleep that leaves you refreshed.\n" +
                    "Deeper, calmer respiratory system.\n" +
                    "Stronger immune system.\n" +
                    "Improved skin tone, health, and colour.\n" +
                    "Healthy hair and scalp.\n" +
                    "Increased self esteem and self worth with greater self awareness\n" +
                    "Balanced chakras." +n+n+n+n+
                    "</p>"
    };

    private String imgFacial[] = {
            "facial_about",
            "facial_part1",
            "facial_part2",
            "facial_masking"
    };

    private String txtFacial[] = {
            "<h1><b>About Facial</b></h1>" +
                    "<p>" +
                    "A facial is a family of skin care treatments for the face, including steam, exfoliation, extraction, creams, lotions, facial masks, peels, and massage. They are normally performed in beauty salons, but are also a common spa treatment. They are used for general skin health as well as for specific skin conditions. Types of facials include European facial, LED light therapy facials, and mini-facials." +n+n+n+n+
                    "</p>",
            "<h1><b>Prepare for Facial Part 1</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Pull your hair back from your face. Use a hairband or hairpins to secure your hair away from your face, so your forehead is completely exposed. This way your entire face will benefit from your facial." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Wash your face with a gentle cleanser. Use your favorite facial cleanser to get your facial off to a great start. Wash your face with warm water (not hot or cold, since these temperatures are harsh on facial skin) and pat it dry with a soft towel.\n" +
                    "Make sure all of your makeup has been removed before you continue with the facial.\n" +
                    "For a luxurious twist, try using the oil cleansing method to wash your face. Rub coconut, almond, olive or jojoba oil into your skin, then wipe it away using a towel moistened with warm water. Rinse your face and pat it dry." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "\n" +
                    "Mix up a facial scrub. You can use a store-bought facial scrub or mix one up using ingredients you have at home. A good exfoliating scrub contains sugar that will “scrub” away the dead skin without damaging the healthy skin underneath. Try one of these great combinations for your scrub:\n" +
                    "1 tablespoon sugar, 1 tablespoon honey, and 1 tablespoon lemon juice\n" +
                    "1 tablespoon finely ground almonds, 1 tablespoon honey, and 1 tablespoon aloe\n" +
                    "1 tablespoon finely ground oatmeal, 1 tablespoon honey, and 1 tablespoon milk" +n+n+n+n+
                    "</p>"+
                    "",
            "<h1><b>Prepare for Facial Part 2</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Gently exfoliate your face. Apply the scrub in a gentle circular motion all over your face, from your T-zone down your nose, across your cheeks, and under your chin. Instead of pressing into your skin, let the scrub do the work for you and lightly lift away the top layer of dead skin cells." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "\n" +
                    "Rinse away the scrub. Use warm water to rinse away the scrub, leaving your face fresh and gleaming. Pat your face with a soft towel to get it ready for the next step in your facial." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Consider using a dry brush or another exfoliating technique. If you don’t want to use a scrub, there are other ways to exfoliate your face. You can use a dry brush, an exfoliating cloth, or an application of an acid exfoliant such as glycolic acid. Any method is fine, but don’t use two methods in combination. Over-exfoliating the skin on your face can damage it.\n" +
                    "If you use a dry brush, purchase one made with very fine fibers and designed for the face, not the body. Start with a completely dry face and brush your face using a circular motion.\n" +
                    "If you use glycolic acid, allow it to sit on your skin for five minutes before rinsing." +n+n+n+n+
                    "</p>"+
                    "",
            "<h1><b>Prepare for Facial Masking And Moisturizer</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +
                    "\n" +
                    "Apply a facial mask. While your pores are still moist and open from the steam treatment, apply a mask to draw out impurities. The type of mask you use should be based on your skin type. Either by a mask or peel from the store, or try one of the following mixtures:\n" +
                    "For oily or acne-prone skin, mix 1 tablespoon of honey, and 1 tablespoon white bentonite clay.\n" +
                    "For dry skin, mix 1 tablespoon of olive oil, 1 tablespoon of honey, and 1 mashed avocado or banana.\n" +
                    "For regular skin, mix 1 tablespoon of honey, 1 tablespoon of yogurt, and 1 mashed avocado or banana." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Let the mask sit for 15 minutes. During this time, the ingredients will nourish your skin, and when you remove your mask it will look brighter and more vibrant. If you want to relax while your mask goes to work, slice up a cucumber, lie down in a comfortable place, and put one slice over each eye. This will keep the mask from dripping into your eyes and moisturize your eyelids at the same time." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Rinse off the mask. When the 15 minutes is up, use warm water to rinse it away. Honey can be quite sticky, so make sure you rinse off all traces of the mask. Use a soft towel to pat your skin dry." +n+n+
                    "</p>"+
                    "<b>Step 4</b>" +
                    "Apply moisturizer. The last step in your facial is to apply a moisturizer to keep your skin glowing long after your facial is complete. Smooth on your favorite moisturizing cream and let it fully absorb into your skin before putting on makeup." +n+n+n+n+
                    "</p>"+
                    ""
    };

    private String imgBridalMakeup[] = {
            "bridal_makeup_1",
            "bridal_makeup_2",
            "bridal_makeup_3",
            "bridal_makeup_4"
    };

    private String txtBridalMakeup[] = {
            "<h1><b>Prepare For Bridal Makeup</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Prep your skin. Whether you’re doing your makeup yourself or not, the day of your wedding, wash your face and use a light moisturizer. Whatever your routine has been, now is not the time to change it. If you exfoliate, however, stay away from a harsh scrub and opt instead for a gentle exfoliating cleanser. If you have a blemish, dab some Visine on it but otherwise leave it alone. Your focus should be on having the clean and soft palette your makeup needs to achieve natural-looking, beautiful skin." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Let your skin tone and undertone guide your makeup color choices. While there are specific skin types (identified from 1-6) for dermatological purposes, makeup companies use their own terminology to describe their makeup colors along the continuum of skin tone. And they aren’t particularly consistent at that. For example, one company might call its lightest foundation “ivory” while another calls the same color “fair.” Thus, in thinking about colors that match your skin tone, it’s best to first think broadly in terms of the range from \"fair\" to \"medium\" to \"deep.\"\n" +
                    "Your skin’s undertones – cool or warm – are also a factor when choosing both matching and complementary colors.\n" +
                    "You can determine your undertone with a quick trick. Hold a piece of silver and a piece of gold jewelry to the back of your hand. If the gold seems to melt away, you have a warm undertone. If the silver does, you have a cool undertone." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Know that primer is required. Between the time you begin applying your makeup and the time you say goodbye to your guests, a lot will have happened. Using a primer before you apply your makeup will help ensure it holds up through the dancing, crying and toasting. You’ll likely still need occasional touch-ups, but they’ll be much less frequent. Additionally, a primer will help smooth fine lines and wrinkles and disguise open pores.\n" +
                    "Use a small amount after you’ve moisturized, but before you put on foundation. Spread it evenly on your face and eyelids to create a smooth base for everything to come." +n+n+n+n+
                    "</p>"+
                    "",
            "<h1><b>Apply For Bridal Makeup</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Apply foundation next. Often people think concealer goes on before foundation, but the experts beg to differ. After you’ve put on the primer, allow it time to dry or set. One of the biggest mistakes you can make when applying makeup is not giving each step time to dry. If needed, turn your hair dryer on its coolest setting and wave it back and forth across your face before moving from one step to the next.\n" +
                    "If you have a cool undertone, look for foundation that has a rosier, redder or blue base.\n" +
                    "If you have a warm undertone, use a foundation with a yellow or golden base.\n" +
                    "To determine if the shade is right, dip a Q-tip in the foundation and apply it to the center of your lower jawline. If it vanishes, it’s the right one!\n" +
                    "Apply foundation in thin layers, starting from the middle of your face and blending outward using a foundation brush. You don’t want any visible lines, so pay close attention to blending beneath your jaw and on your neck.\n" +
                    "Don’t cake on foundation. It will look overdone and likely smear or streak." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Add concealer where needed. Whereas foundation is designed to even skin tone, concealers are designed to hide things, like blemishes and dark circles under your eyes. If you were to apply it before your foundation, you’d rub much of it away while working the foundation into your skin. To cover red areas or dark circles, use a concealer brush to dot a liquid concealer the same shade or one shade lighter than your skin tone along trouble areas. Then pat the brush against your skin to spread the concealer. If it’s not blended enough, dip the tip of a makeup sponge in water and work the concealer outward.\n" +
                    "To hide a blemish, put foundation on it first, then apply concealer before setting it with powder. If you can still see it, add more concealer and powder. Make sure you pat the concealer on the blemish. Don’t rub." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Apply highlighter, but go easy on it. Highlighter isn’t always in everyone’s makeup bag, but its purpose is to make certain facial features like eyes appear larger and to add both glow and a youthful dewy look. Using too much, or a formulation with sparkle or glitter, is a recipe for photo disaster, so tread lightly. They come in both liquid and powder forms.\n" +
                    "If you use a liquid, dab it on with a brush after your foundation in the shape of a check mark. Start near your inner eye, go down at a slight angle toward your nostril and then up your cheekbone, blending toward your temple. Do the same above your brows, down the center of your nose, the center of your forehead and your chin.\n" +
                    "If you’re using a powder highlighter, use it after you powder and brush it under your brows, lightly in the corner of your eyes and on the tops of your cheekbones. Don’t use powder highlighter under your eyes or over your mouth or you’ll look sweaty in photos." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Set your base and then contour. Really, you have two choices next. You can use a cream blush rather than a powder blush or set your base with powder. If you opt to use a powder blush, first use a translucent powder to set your base and control shine. Powder is one of those times when less is absolutely more. You’re going for luminous, not laden down. Use a medium-sized brush to dust lightly over your forehead, the sides of your nose and on your chin.\n" +
                    "Then use a powder bronzer that’s just a shade or two darker than your foundation and brush it in the shape of a 3 on both sides of your face.\n" +
                    "To do so, start at your hairline, move down the side of your face and then under your cheekbone, back to the side of your face and then below your jaw.[16][17][18]\n" +
                    "Have pressed powder on hand. There are always areas that shine and need a quick dab before a photo or while in the restroom." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Blush gently. Whether you’re using a cream blush prior to your powder or a powder blush after, go lightly with the blush. You can always add more. Apply blush to the apples of your cheeks and blend upwards and out toward your hairline. You don’t want a pink nose, so don’t brush it there. To finish, do a small check mark at your cheek bones.\n" +
                    "If you have fair skin with cool undertones, colors like soft rose or baby pink with hints of mocha or beige will look nice.\n" +
                    "If you have fair skin with warm undertones, go for golden apricot or a light peach with a bit of pink.\n" +
                    "If you have medium skin with cool undertones, try cranberry, light raspberry or rosy pink.\n" +
                    "If you have medium skin with warm undertones, look for soft coral with hints of brown or sunkissed apricot.\n" +
                    "If you have deep skin with cool undertones, blush on shades of plum, grape and raspberry.\n" +
                    "If you have deep skin with warm undertones, keep it rich with brown suede or a deep coral with a little bronze." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Bring color to your eyes with shadow and liner. Wedding experts generally don't recommend a darkly dramatic eye, opting instead to use eye liners in colors other than black, paler or muted eye shadows complementary to your eye color, and highlighters to make eyes look large. Try brown, grey, and green eyeliners and apply it on both your top and bottom eyelids to draw attention to your eyes. Using a cream eye shadow will last longer and is best used on the lids of your eye while a powder is best in the crease of your eye. Use a powder highlighter in the corners of your eyes and under your brow.\n" +
                    "As for colors, try bronze shades if you have green eyes, mocha if your eyes are hazel, navy and dark brown for blue eyes, and purples and grays for brown eyes.\n" +
                    "Dampen an eyeliner brush in water and brush it into your eye shadow if you want to line your eyes with your eye shadow." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Add mascara and tidy up your brows.There likely will be tears more than once, so you must have waterproof mascara. Also, if you don’t already regularly wear false eyelashes, your wedding day is not the day to start. Instead, make sure you have a good eyelash curler, a volumizing mascara and a lengthening mascara. Curl your lashes before applying both. With your mascara, start at the root of your eyelashes and wiggle up from side to side to the top. Go with black – it looks good on everyone.\n" +
                    "Finish by framing your face with a brow powder a little darker than your natural color. Brush it into the natural line of your eyebrows, working outward to the end of your eyes." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Create lips that look good and last. Just as you need your facial skin to be well moisturized prior to applying makeup, your lips also need to be moisturized so they aren’t so dry or cracked that once color is applied all you see are lines. To avoid this, use a lip hydrator and let it absorb a couple of minutes before applying color. Choose a color that complements your blush while also following these tips. Also, while many newer lipsticks claim to last hours, going with a lip stain is a better bet on your wedding day.\n" +
                    "If you have fair skin with cool undertones, go with nude, light mocha and light mauve; if you have warm undertones, try sand, nude peach or shell. Avoid bright pinks, dark bronzes and dark mochas.\n" +
                    "If you have medium skin with cool undertones, choose a rosy pink, pomegranate or cranberry; if you have warm undertones, go for bronze, copper and cinnamon. Avoid nudes.\n" +
                    "If you have deep skin with cool undertones, check out raisin, wine or ruby red; if you have warm undertones, try honey, ginger or a coppery bronze. Avoid anything close to orange.\n" +
                    "If using lip liner, apply your lip stain or lipstick, if that’s what you choose, almost to the edge of the lip. Next use a lip liner to define the shape of your lips and to seal it all in. Add just a little more color and blend the two together.\n" +
                    "If you go for a bolder, or statement, lip color, keep your eyes soft and natural to avoid the bridal doll look.\n" +
                    "Avoid smacking your lips together because this can make your smile look lop-sided.\n" +
                    "Skip the lip gloss. First, it doesn’t last long. Secondly, it will end up on your groom’s lips. And, finally, it can create a glare in photos." +n+n+n+n+
                    "</p>"+
                    "",
            "<h1><b>Picking Your Wedding Look</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Remember it’s your wedding, not girls’ night out. One of the biggest mistakes brides make is caking on makeup – too many layers of overly dark foundation, far too smoky eyes, lipstick that is blindingly bright in photos and so forth. You don’t want to wince when you look back on your wedding photos like you do when looking at those from prom. Think timeless. Leave experimentation for another time and place – you want to look like the best version of you, not like someone else.\n" +
                    "Makeup artists highly recommend staying away from all makeup with any glitter or sparkle because it bounces off flash photography, leaving white spots on your skin. They can be removed from photos, but it’s expensive." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Make sure your makeup matches your hair and dress. Because your gown most likely will be white, you’ll need some color to compensate for its lack of color. Yet just as you don’t want to wear too much makeup, you also don’t want to wear the wrong style of makeup. Your goal is a cohesive look in which each piece makes sense with every other. Even if you love a certain style of makeup, or are simply accustomed to wearing makeup one way, that doesn’t mean it’s going to look good with your hair and dress.\n" +
                    "If your gown is romantic, billowy and soft, for instance, smoky eyes and bright red lipstick will clash, not be complementary.\n" +
                    "If you’re wearing your hair in an updo with a lot of adornments, you should keep your makeup simple, yet still fresh and rosy.\n" +
                    "Look at bridal magazines and red carpet images, specifically, to see how stylists put together an entire look that’s stunning rather than shocking." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Collect images of looks you like. Another mistake brides often make is waiting until the last minute to decide how they’re going to do their makeup. So definitely get started early. Pull out those bridal magazines and start looking at the makeup used. When you see something you like, tear out the whole page and put it in a file marked “makeup.” Also look in other fashion magazines, search for images online (and print them) and browse other publications.\n" +
                    "Identify what it is you like about the makeup in each image you find. Use a sharpie and write it down to the side.\n" +
                    "Look around and jot down notes at different times of the day and when you’re in different moods.\n" +
                    "After you’ve collected a nice sample, try to determine if you notice any themes. For example, have you repeatedly written that you like a particular lip color? Do you see you’ve written several notes on lightening undereye circles?" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Think about looks you’ve personally seen and liked. Remember back to weddings you’ve attended or been a part of in the past. When do you remember thinking to yourself about the bride, “Wow, she looks AMAZING!” You may not be able to remember exactly what it was about her makeup that you liked, or if it was even her makeup that made her stand out, but you know one thing – she didn’t mess it up and she looked fabulous. Give her a call. She will certainly take it as a compliment. Ask her if she did her makeup herself. If not, ask her who did. If she had a makeup artist, ask for the person’s name and contact information.\n" +
                    "If you’re really struggling in deciding on a look, remember that one rarely fails: radiant skin, rosy cheeks and pink lips." +n+n+n+n+
                    "</p>"+
                    "",
            "<h1><b>Getting Your Look Ready Before the Wedding</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Don’t neglect your skin. If you’ve not been particularly diligent about taking good care of your facial skin, now is the time to start. Get facials once per month to firm your complexion and illuminate your skin, which will create a good base for makeup. Make sure you wash your face well not only in the morning but also at night to get rid of the day’s makeup. Regularly exfoliate to remove dead skin and even out your skin tone. Moisturize your face and drink plenty of water, too. Applying makeup to dry, splotchy and flaky skin won’t produce your desired look, no matter how hard you try.\n" +
                    "If you have a breakout a day or two before your wedding, do not pick at it! It’s much easier to cover a blemish than a scab.\n" +
                    "Wax brows or other areas of your face at least one week before your wedding to avoid any marks. If you’ve never waxed before, don’t start doing so days before your wedding because you can get a rash if you’ve never before waxed.\n" +
                    "Consider whitening your teeth, too. There are many options, from having it done at the dentist’s office to doing it at home with over-the-counter products. You should start 3-4 months before the wedding." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Decide who will do your makeup. You may choose to do your own makeup, as Kate Middleton did before she wed Prince William. Or you may decide to have a friend or a makeup artist do it. If the latter, you may already have a recommendation from a friend. If not, consider asking your wedding planner if he or she can recommend one. You could also ask the coordinator of events for your wedding venue, look online or talk with the salon owner where you have your hair done or where you’re planning to have your hair done if you’re going that route.\n" +
                    "No matter whom you select, ask to see a portfolio. If it’s heavy in everything but the look you want, find someone else." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Set up a trial run before the wedding. If you choose to have your makeup done by another person, schedule a time at least one month before the wedding to have a trial run. By this time, you’ll be more settled in the overall planning of your wedding and have a better idea of what you want. Take your collected images, a photo of your dress, a photo or image of what your hair will look like and a photo of yourself when you think you look your best to your trial run. This will all help the person doing your makeup both create the look you want and one that will work with your other elements.\n" +
                    "If you plan to tan before your wedding, you need to achieve that color before your makeup trial, too, or the results will not be the same.\n" +
                    "Also remember that while you might find a makeup look that you love, it might not look good with your coloring. If you’re using a makeup artist, allow him or her to guide you on these matters.\n" +
                    "Always wear a white t-shirt to your trial run so you can see how your makeup will look against your dress. Take a photo with no flash before you leave." +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Do a trial run by yourself. If you don’t know much about makeup application, keep reading. You can also research it online; watch YouTube videos; or go to a department store, look around at the women selling products at the makeup counters and find someone wearing a makeup style you like. Ask her for a makeover, which they’ll often do for free in hopes that you’ll buy some of their products. You might find that you do. Practice doing your makeup in natural light, using the products you plan to use. Also wear a white t-shirt and take a photo of yourself afterward." +n+n+n+n+
                    "</p>"+
                    ""
    };


    private String imgHairCut[] = {
            "haircut_trim",
            "haircut_layer",
            "haircut_cutbang"
    };

    private String txtHairCut[] = {
            "<h1><b>Trimming Hair</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Start with washed hair. The hair should be clean and damp when cutting. After the hair is washed, towel dry it to remove excess water, and then brush out any knots.\n" +
                    "Brush from the ends, and work your way up to the root to work out knots. This will prevent damage to the hair and will put less strain on the scalp." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2  </b>" +n+
                    "Sit in proper lighting. For a quality haircut, you will need to be in a well lit area. The girl who is getting the haircut needs to be sitting down straight, preferably in a chair high enough so the stylist does not need to lean down." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Comb the hair. The hair should be combed straight back first, and then parted in the place it normally is. If the hair is worn with a middle part, do that. If the hair has a side part on the left or right side, do that. The hair will typically fall where it is trained to be.\n" +
                    "Check behind the ears for snarled or stuck hair. All of the hair needs to be combed straight down for a proper cut." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Use sharp scissors. The ideal scissors to use would be stylist scissors specifically designed for hair cuts. Dull scissors will not cut the hairs cleanly, and they might create split ends." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Start cutting in the back at the center. This will serve as your guide as you make your way towards the sides and front. You will use the back piece as a reference as you are cutting around the sides to keep the trim even.\n" +
                    "Pull up the back section of hair, and bring the ends through your forefinger and middle finger. You should have about 1/2 inch to two inches sticking out from your fingers. Cut at a 45 degree angle to give the hair a softer, more natural look.\n" +
                    "The amount of hair you cut depends on how far up the damage goes, but typically it will be about 1/2 inch to two inches. Start by cutting less, and then go back to cut more if desired.\n" +
                    "Have the person lean their head forward when cutting the back to help you perform a more even trim." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Trim the sides. Work your way from your guide piece to the side. When cutting the hair that lays on the shoulder, have the person slightly lean their head to the opposite side. This will bring the hair up to help you cut more evenly." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Cut the opposite side. Once you make it to the front of one side, go back to your guide piece in the back, and begin cutting the opposite side. Have the person lean their head to the opposite side you are cutting, and be sure to reference the guide piece the entire time." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Check the length on both sides. Once you are finished, come to the front, and bring the hair from both sides between your fingers. Pull them down and flat, and look to see if they are the same length. If one side or piece is longer, go ahead and trim it appropriately." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 9</b>" +n+
                    "Finish the cut with a blow dry. Remember, as the hair dries, it will slightly shorten. If you notice any uneven pieces after the hair is dry, dampen the area, and even it out with scissors." +
                    "" +n+n+n+n+
                    "</p>"+
                    "",
            "<h1><b>Cutting Layers</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash and towel dry the hair to be cut. The hair should be clean and damp while it is being cut. Comb all of the tangles out, and apply leave in conditioner if needed.\n" +
                    "Decide on the length you want your hair to be before it is pinned up." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2  </b>" +n+
                    "Divide the hair into sections. The layers on each side should be the same length, and to help do this, it is important to divide each side into symmetrical sections. The trick is to pull away from the places you want layers by combing each section at an angle down towards the face from the back. Here are the sections you will pin:\n" +
                    "Pin together the \"top box\" section. Use a comb to make a part on the top left and right side. Use the end of the eyebrows as a guide for how far over the part should be. Divide this section in half. One part will be from the crown of the head to the forehead, and the second part will be from the crown of the head and reach to the middle back section of your head. This hair will be combed forward and be section off in the front. The back of the hair from the middle down will not be layered. It can be left loose or pinned back.\n" +
                    "Divide the right and left front sections. These sections will start at the temples and end at the ear. Start with the comb at the back of the head, and angle down towards the bottom of the ear." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Angle your cuts. When you cut or trim hair, you will angle the scissors up and at a 45 degree angle, and use the tip of the scissors to cut small pieces at a time. This will create uneven edges that will give the hair a more natural look.\n" +
                    "As you are cutting, you want to avoid bringing the scissors straight across the bottom. Instead, slightly pull the scissors away after each cut before cutting the next piece." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Start with the front \"top box.\" Take out the clip from the top front section. Make sure the hair is still damp and completely combed out. Lift the hair so that it is angled between your forefinger and middle finger about 90 degrees from the head. It is important to cut the hair at an angle so it falls more naturally. Slide your fingers toward the ends until they reach the length you want the layer to end. You will cut the hair that is sticking out from your fingers.\n" +
                    "Cut a little longer than you want the layers to be to allow room for error. Keep in mind that hair shrinks when it dries.\n" +
                    "Common layers are cut right below the earlobe, or just above the jawline to help frame the face." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Trim the front left section. Next, take out the clip from the left section of hair. Brush through the hair, and run your fingers through the section at a 90 degree angle from the head. Hold the hair straight between your forefinger and middle finger, down to the side of the face where you want the layer to end. Trim the length of hair extending from your fingers. Remember to trim at an angle to create a more natural look." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Cut the front right section. Next, take out the clip from the right section of hair. Brush through the hair, and run your fingers through the section at a 90 degree angle from the head. Bring your fingers down to the side of the face where you want the layer to end. Make sure it is even with the side you just cut. Use one hand to pull the layer that was just cut down so you can match up the two sides. When you are ready, cut the hair extending from your fingers." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Comb through the hair. When you are finished with each section, check the length of the layers. Line them up on both sides to see if they are symmetrical. If one side or piece is shorter than the other side, go back and trim it shorter. When you make adjustments, take off small amounts at a time so you don't end up making the hair shorter than desired." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Blow dry the hair. Use a round brush as you blow dry to bring out the layers. Twist the brush inward as it dries to bring the shorter layers in with the longer layers. If you notice an area that needs to be cut shorter, remember to get all of the hair damp again before you cut it. If you only dampen one side, you will not be able to properly match up each side because the wet hair will appear longer than it will be once it dries." +
                    "" +n+n+n+n+
                    "</p>"+
                    "",
            "<h1><b>Cutting Bangs</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Prepare your bangs. Whether you are trimming bangs, or creating bangs for the first time, the front section of hair should be dry and combed out before cutting. Use a comb to section off only the area you wish to cut, and put the rest in a ponytail or clipped out of the way.\n" +
                    "A common problem when cutting bangs is cutting them too short. This is why bangs are best cut when hair is dry.\n" +
                    "Cut the bangs longer than you ultimately want them. This way, you can figure out the shape you want, and go back to make adjustments." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2  </b>" +n+
                    "Cut at a curve. Bangs are not cut straight across. Instead, they curve down towards the temples to help create a frame for the face. However, it depends on the look your are going for." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Gather the hair. If you are simply trimming bangs, you will bring the comb through underneath the bangs where you want them to end. If you are making new bangs, use the comb to section off the hair you want to cut. Depending on how thick the hair is, bangs usually start right in front of the middle of the crown and angle downward on both sides towards the temples. You can play around with the look you prefer." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Cut in the middle. Hold the scissors vertically at a 45 degree angle, and make a small cut directly below the comb in the center. Work your way toward one side. By starting in the middle, you will have more control over how short the bangs end up. Angle the scissors down when working your way to the edge to create a gradual curve. Once you have one side finished, bring the scissors back to the middle, and cut the other side." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Check for symmetry. Use your finger tips to pull down on the hair between your forefinger and middle finger. See if the bangs are the same length on each side. If they are not even, carefully trim the side that is longer. Cut tiny amounts at a time so you do not accidentally cut the longer side shorter, which may result in bangs that are shorter than you want." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Sweep away cut hair. Use a makeup brush or blow dryer to get rid of those tiny trims. If the bangs do end up shorter than you were going for, do not worry. Hair grows at a rate of 1/2\" per month on average, and that makes a big difference when it comes to bangs." +
                    "" +n+n+n+n+
                    "</p>"+
                    ""
    };


    private String imgHairDo[] = {
            "hairdo1",
            "hairdo2",
            "hairdo3",
            "hairdo4",
            "hairdo5",
            "hairdo6",
            "hairdo7",
            "hairdo8",
            "hairdo9",
            "hairdo10",
            "hairdo11",
            "hairdo12",
            "hairdo13",
            "hairdo14",
            "hairdo15",
            "hairdo16",
            "hairdo17",
            "hairdo18",
            "hairdo19",
            "hairdo20",
            "hairdo21",
            "hairdo22",
            "hairdo23",
            "hairdo24",
            "hairdo25",
            "hairdo26"
    };

    private String txtHairDo[] = {
            "<h1><b>Flower Braid</b></h1>" +
                    "<p>" +
                    "What You’ll Need: \n" +n+
                    "- Mini hair elastics\n" +n+
                    "- Bobby pins\n" +n+
                    "- Sea salt spray\n" +n+
                    "Step 1:" +n+
                    " Grab a one-inch section of hair from each side of your head just above your ears and twist them back to the center of your head. Secure with a mini hair elastic. \n" +n+
                    "Step 2:" +n+
                    " Using hair underneath the elastic, braid a two-inch section of hair and secure with another elastic. \n" +n+
                    "Step 3:" +n+
                    " Wrap the braid around the base of itself until it forms a flower shape, then use bobby pins to secure in place. \n" +n+
                    "Step 4 (Optional):" +n+
                    " Use sea salt spray on the rest of your hair to give it a beach-y texture." +n+n+n+n+
                    "</p>" +
                    "",
            "<h1><b>A Crown For Curls</b></h1>" +
                    "<p>" +
                    "What You’ll Need: \n" +n+
                    "- Bobby pins\n" +n+
                    "- Mini hair elastics \n" +n+
                    "- Tail comb\n" +n+
                    "- Hair clips\n" +n+
                    "Step 1:" +n+
                    " Using a tail comb, create a front section of hair all the way around your head from ear to ear. Clip back the rest of your hair to keep it out of the way for now. \n" +n+
                    "Step 2: " +n+
                    "Beginning at one side of your head, French-braid the front section of hair along the hairline. \n" +n+
                    "Step 3:" +n+
                    " Continue the French braid, adding more hair to each strand as you go.\n" +n+
                    "Step 4:" +n+
                    " Once the braid is at your ear, continue with a traditional three-strand braid to the end of the hair. \n" +n+
                    "Step 5:" +n+
                    " Secure the braid with a mini hair elastic at the bottom. \n" +n+
                    "Step 6:" +n+
                    " Make the braid a bit thicker by gently tugging apart each strand so the weave isn’t too tight. \n" +n+
                    "Step 7:" +n+
                    " Lift the braid up and over your head, flush against the French-braided section, until the end of the braid reaches the opposite ear. See the GIF below for a more detailed view on this. \n" +n+
                    "Step 8:" +n+
                    " Pin back any extra hair in the front that wasn’t woven into the French braid. This piece can be used to cover up the end of the braid if your hair isn’t long enough to reach the opposite side of your head. \n" +n+
                    "Step 9:" +n+
                    " Unclip the rest of your hair and tousle it forward. \n" +n+
                    "Step 10:" +n+
                    " If you need to secure any parts of the braid, use a bobby pin to do so." +n+n+n+n+
                    "</p>"+
                    "",
            "<h1><b>Braided Bun</b></h1>" +
                    "<p>" +
                    "What You’ll Need: \n" +n+
                    "- Bobby pins\n" +n+
                    "- Mini hair elastics\n" +n+
                    "Step 1: Gather your hair into a low ponytail at the nape of your neck and secure it with an elastic. \n" +n+
                    "Step 2: Braid the ponytail into a three-strand braid. \n" +n+
                    "Step 3: Secure the end of the braid with a mini hair elastic. \n" +n+
                    "Step 4: Wrap the braid around the base of the ponytail until it forms a bun. Pin the braided bun in place with as many bobby pins as you need." +n+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Twist ‘n’ Pin</b></h1>" +
                    "<p>" +
                    "What You’ll Need: \n" +n+
                    "- Bobby pins\n" +n+
                    "- Reworkable hold paste\n" +n+
                    "Step 1: Use a pea-size amount of reworkable hold paste in your fingertips to slick down any major cowlicks. \n" +n+
                    "Step 2: Start with a two-inch section of hair, twisting the section around itself into a tight coil. \n" +n+
                    "Step 3: Once the coil is tight enough that the twist naturally forms a small bun, continue wrapping the bun up and toward your head. Pin the bun in place. See the GIF below for closer look at this technique. \n" +n+
                    "Step 4: Continue steps 2-3 until all of your hair is pinned up."+n+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Half-Up Hair Wrap</b></h1>" +
                    "<p>" +
                    "What You’ll Need:\n" +n+
                    "- Mini hair elastics\n" +n+
                    "- Bobby pins\n" +n+
                    "- Teasing brush\n" +n+
                    "- Hairspray\n" +n+
                    n+"Step 1: Prep your roots by spraying hairspray for volume and hold. \n" +
                    n+"Step 2: Use a teasing brush to tease hair from the front of your hairline to the crown of your head. Tease one-inch sections at a time, brushing from the mid-shaft to the root to create more volume. \n" +
                    n+"Step 3: Create a half-up ponytail with the top half of hair, securing with an elastic. \n" +
                    n+"Step 4: Grab a one-inch section of hair directly underneath the elastic of the half-up ponytail. \n" +
                    n+"Step 5: Wrap the loose one-inch section of hair around the half-ponytail to conceal the elastic. \n" +
                    n+"Step 6: Pin the ends of the wrapped hair underneath the elastic."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Piled-Up Pony</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Hair elastics\n" +
                    n+"- Bobby pins\n" +
                    n+"Step 1: Gather your hair into a high ponytail, leaving out your bangs or the front pieces of hair. Secure the ponytail with an elastic. \n" +
                    n+"Step 2: Use bobby pins to pin any stray curls or flyaways down toward the ponytail. \n" +
                    n+"Step 3: Tousle your bangs or the front pieces of hair to frame your face. \n" +
                    n+"Step 4: Tousle your ponytail to place your hair exactly the way you want!" +
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>The Braided Half-Up</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Mini hair elastics \n" +
                    n+"- Bobby pins\n" +
                    n+"- Hair clip\n" +
                    n+"Step 1: At the front of your face, use your fingers to create a two-inch section of hair on the left. Braid the section. \n" +
                    n+"Step 2: Secure the left braid with a mini hair elastic. \n" +
                    n+"Step 3: Repeat Steps 1 and 2 on the right side of your head. \n" +
                    n+"Step 4: For the look of a thicker braid, gently tug apart each braid using your finger tips. \n" +
                    n+"Step 5: Section off the top of your hair and put it in a hair clip to keep it out of the way for now. \n" +
                    n+"Step 6: Bring both braids around to the back of your head and secure them together with a mini hair elastic in the center of your head. \n" +
                    n+"Step 7: Take down the top section of hair and secure it into a half-up ponytail with a mini hair elastic at about the same spot as the elastic holding the braids together. \n" +
                    n+"Step 8: Secure a bobby pin into the top elastic and thread it through the bottom elastic on the braids, then push it through to secure both elastics flat on the head."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Shorty on the Side</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Tail comb\n" +
                    n+"- Mini hair elastics\n" +
                    n+"Step 1: Use your tail comb to create a deep side part in your hair. \n" +
                    n+"Step 2: Grab a two-inch section of hair on the same side as the part and begin braiding your hair about one inch above your ear. This should be a traditional three-strand braid. Continue braiding until about one inch from the ends of your hair. \n" +
                    n+"Step 3: Secure the braid with a mini hair elastic. \n" +
                    n+"Step 4: For a thicker braid, gently tug apart each part of the braid with your fingertips."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Bangin’ Braid</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Tail comb\n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Bobby pins\n" +
                    n+"- Hair clips\n" +
                    n+"Step 1: Using a tail comb, part the front section of your hair into a triangle with clean, straight parts. Hold the rest of your hair away from your face by clipping it back with hair clips. \n" +
                    n+"Step 2: Begin braiding the bangs section with three passes of a French braid before continuing with a traditional three-strand braid. See the GIF below for more clarification on this technique. \n" +
                    n+"Step 3: Continue down the bangs until you reach the temple area, then secure with a mini hair elastic. \n" +
                    n+"Step 4: Use a bobby pin to pin the braid back into the hairline. Pull the clips off of the loose hair and tousle hair to cover the elastic and pin in the front."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Loose Braid</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Teasing brush\n" +
                    n+"- Mini hair elastic\n" +
                    n+"- Hair clip\n" +
                    n+"- Texturizing finishing spray\n" +
                    n+"Step 1: Create a section of hair that is the width of your eyebrows and the depth from your hairline to the crown of your head. \n" +
                    n+"Step 2: Using your teasing brush, hold up the section of hair and tease by gently brushing down on the left side, then brushing down on the right side, then alternating side to side until you have volume. \n" +
                    n+"Step 3: Braid the section, loosely holding each piece so the braid isn’t too tight. \n" +
                    n+"Step 4: Secure the braid with a mini hair elastic at the bottom. \n" +
                    n+"Step 5: Apply texturizing finishing spray to all of the hair not in the braid. Use your hands to scrunch the hair for even more texture. \n" +
                    n+"Step 6: Fix any stray hairs and you’re done!"+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>A Dressed-Up Pony</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Bobby pins\n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Sea salt spray\n" +
                    n+"Step 1: Gather your hair into a low ponytail at the nape of your neck, leaving about one inch of hair underneath out of the ponytail. Secure with an elastic. \n" +
                    n+"Step 2: Create a three-strand braid with the one-inch section of hair underneath the ponytail and secure the end of the braid with a mini hair elastic. \n" +
                    n+"Step 3: Gently tug apart the braid with your fingertips to get a thicker look. \n" +
                    n+"Step 4: Wrap the braid around the base of the ponytail so the elastic is completely covered. \n" +
                    n+"Step 5: Pin the braid in place. \n" +
                    n+"Step 6: Use sea salt spray on your ponytail for extra texture."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Half French Twist</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Bobby pins\n" +
                    n+"Step 1: Gather the top quarter section of your hair into a small ponytail and secure with a mini hair elastic. \n" +
                    n+"Step 2: Grab a two-inch section from either side of your head and pull backward. \n" +
                    n+"Step 3: Loosely secure both pieces together with an elastic to create a second small ponytail. \n" +
                    n+"Step 4: Twist the ends of the second small ponytail until the twist becomes hard.\n" +
                    n+"Step 5: Keep twisting until the hair above the elastic is also a hard, taut twist. Use a bobby pin to secure the twist flat on your head, then continue pinning to keep the entire length of the twist in place."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Frohawk</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Hair clips\n" +
                    n+"- Bobby pins\n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Hairspray\n" +
                    n+"Step 1: Use hair clips to create four sections of hair down the center of your head. \n" +
                    n+"Step 2: Replace each hair clip with a hair elastic for a permanent hold. \n" +
                    n+"Step 3: Smooth down any stray pieces of hair with bobby pins. \n" +
                    n+"Step 4: Use your fingertips to rough up each section of hair until it looks like one continuous mohawk."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>The Mini Bun</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Tail comb\n" +
                    n+"- Mini hair elastics \n" +
                    n+"- Bobby pins\n" +
                    n+"Step 1: Using your tail comb, create a part on the left and right side to make one large section at the top of your head. If you want to get extra ~fancy~ you can make zigzag parts instead by pushing the tail comb backwards from left to right (in the shape of a zigzag) instead of just going straight back. \n" +
                    n+"Step 2: Secure the section with a mini hair elastic close to the root. \n" +
                    n+"Step 3: Hold up the section and tightly twist it around itself. \n" +
                    n+"Step 4: Roll the section down into a bun and secure it to your head with a bobby pin."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>The New Topsy Tail</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Bobby pins\n" +
                    n+"Step 1: Gather a section of hair on the top of your head, about the width of the space between the arches of your eyebrows. Loosely secure the section at the back of your head with a mini hair elastic. This will be your first ponytail. \n" +
                    n+"Step 2: About two inches lower than the first ponytail, gather a two-inch section of hair from both sides of your head together at the back. Secure them together with an elastic so that this second ponytail sits on top of the first. \n" +
                    n+"Step 3: Repeat Step 2 to create a third ponytail. \n" +
                    n+"Step 4: Repeat Step 2 to create a fourth ponytail. \n" +
                    n+"Step 5: Grab the first ponytail and remove the end from underneath the other three ponytails. Create a small space in the hair above the elastic, then push the ponytail up and through the space, creating a topsy tail. Do this on all four ponytails. \n" +
                    n+"Step 6: Grab a half-inch section from the bottom of the first ponytail. Wrap the section around the base of the ponytail to hide the elastic. Pin the hair in place so the ponytail sits flat on your head."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>The Fun Bun</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Hair elastics\n" +
                    n+"- Bobby pins\n" +
                    n+"Step 1: Gather all of your hair into a ponytail at the front of your head as close to your hairline as possible. Secure the ponytail with an elastic. \n" +
                    n+"Step 2: Use a second elastic on the ponytail about two inches up from the ends. This will help keep your hair in place for the next step. \n" +
                    n+"Step 3: Roll the second elastic back toward the first elastic to create a large bun. Use bobby pins to secure the bun in place.\n" +
                    n+"Step 4: If you have any other curls or flyaways, tuck them into the bun with bobby pins."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Triple-Threat Braid</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Bobby pins\n" +
                    n+"- Tail comb \n" +
                    n+"- Hair clips\n" +
                    n+"Step 1: Part your hair to one side. Using your tail comb, create a section perpendicular to the part all the way down to the hairline behind your ear. Clip back the rest of your hair to keep it out of the way for now. \n" +
                    n+"Step 2: At the top of the section you just created, take a smaller one-inch section and begin a three-strand braid all the way down the hair. \n" +
                    n+"Step 3: Using your tail comb, tease the end of the braid to secure it without an elastic. Vigorously comb from the ends of your hair up to the end of the braid until there’s enough tension that the braid won’t unravel. \n" +
                    n+"Step 4: Make another one-inch section of hair next to the first braid and braid all the way down to the end. Tease the end of the braid with the tail comb. \n" +
                    n+"Step 5: Repeat Step 4 with a third, final section of hair. \n" +
                    n+"Step 6: Pull all three small braids together and back behind your ear and pin in place. \n" +
                    n+"Step 7: Add a second bobby pin to create an “X” shape, which will help keep the braids extra secure. \n" +
                    n+"Step 8: Unclip the rest of your hair and drape it over the ends of the braids to hide your bobby pins and make the hairstyle look seamless."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>10-Minute Fancy Updo</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Bobby pins\n" +
                    n+"- Hair clips\n" +
                    n+"- Hairspray\n" +
                    n+"Step 1: Separate your hair into four sections: face-framing pieces in the front, one section on each side from your ear to your temple, and the rest of your hair in the back. \n" +
                    n+"Step 2: Separate the largest section of hair in the back into two more sections: top and bottom. Clip the top section up to keep it out of the way for now. Secure the bottom section into a low ponytail at the nape of your neck with a mini hair elastic, then put another elastic about two inches from the bottom of the ponytail. \n" +
                    n+"Step 3: Roll the ponytail up into a bun and secure with a bobby pin at the nape of your neck. \n" +
                    n+"Step 4: Take the clip out of the top section of hair and smooth it back and down. Loosely secure it into a half-up ponytail with a mini elastic. \n" +
                    n+"Step 5: Twist the tail of the ponytail into its base and pin the twist down above the bun. See the GIF below for a closer look at this technique. \n" +
                    n+"Step 6: Braid the section of hair on the left and secure the braid with an elastic at the end. For a thicker look, gently tug the braid apart from top to bottom. \n" +
                    n+"Step 7: Wrap the braid around the back of the head and secure with a bobby pin just above the bun. \n" +
                    n+"Step 8: Repeat Step 6 on the right side. \n" +
                    n+"Step 9: Repeat Step 7 on the right side. \n" +
                    n+"Step 10: Use hairspray to secure the style in the back and fix any face-framing pieces in the front to fall however you’d like."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Chic Chignon</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Bobby pins\n" +
                    n+"- Mini hair elastics \n" +
                    n+"- Tail comb\n" +
                    n+"- Hairspray (optional)\n" +
                    n+"Step 1: Use your tail comb to create a front section of hair about one half-inch back from your hairline, wrapping around the whole head from ear to ear. Leave the hair down for now. \n" +
                    n+"Step 2: Secure the back section of hair into a low ponytail at the nape of your neck with a mini hair elastic. \n" +
                    n+"Step 3: Use another hair elastic on the ponytail about one inch up from the ends. This will help keep all of the hair in one clean section for the next step. \n" +
                    n+"Step 4: Roll the bottom of the ponytail up to the top elastic to create a bun, then secure the bun to your head with bobby pins. \n" +
                    n+"Step 5: Leaving out a one-inch piece on either side of your head, pin the front section back and down into the bun. \n" +
                    n+"Step 6: Wrap each front piece across the back of the head and pin on the opposite side, pushing the bobby pins into the bun.\n" +
                    n+"Step 7 (Optional): Finish with hairspray to hold the style in place."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>French Hawk</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Bobby pins\n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Texturizing finishing spray\n" +
                    n+"- Tail comb\n" +
                    n+"Step 1: With your tail comb, separate out a two-inch wide section of hair at the top of your head in the center. It should start at your hairline and end at the crown of your head. \n" +
                    n+"Step 2: Beginning at your hair line, separate your section of hair into three smaller sections to start your French braid. \n" +
                    n+"Step 3: Continue to French-braid the entire section, picking up pieces to add to your braid as you go. \n" +
                    n+"Step 4: Once your braid reaches the end of the section of hair you created, secure the end of the braid with a mini hair elastic. \n" +
                    n+"Step 5: Bobby pin the hair elastic down to your head. For an extra secure hold, push the bobby pin through the elastic before pushing into your hair. \n" +
                    n+"Step 6: On your loose hair, spray texturizing finishing spray to add body."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Secret Braid</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Teasing brush\n" +
                    n+"- Hair clip\n" +
                    n+"Step 1: Create a section of hair on one side of your head from two inches above your ear down to the nape of your neck. Use a hair clip to hold the rest of your hair away from this section. \n" +
                    n+"Step 2: Braid this section of hair. \n" +
                    n+"Step 3: Instead of securing with an elastic at the bottom of the braid, use a teasing brush to create enough grit to hold the braid. Brush from the bottom of the hair section up to where the braid ends until the hair is teased enough that the braid will hold. \n" +
                    n+"Step 4: Gently tug apart each section of the braid with your fingertips. This will make the braid look fuller, but it should not be so harsh that it undoes the braid. \n" +
                    n+"Step 5: Rub the braid between your fingertips from the bottom to the top to give it extra grit. \n" +
                    n+"Step 6: Unclip the rest of your hair and partially cover your new braid with the loose hair so that the braid is a secret!"+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Beach Braids</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Tail comb\n" +
                    n+"- Sea salt spray\n" +
                    n+"Step 1: Part your hair in the middle. Using your tail comb, section off a front piece of hair in the middle, about two inches wide. Keep this section separate from the rest of your hair for now. \n" +
                    n+"Step 2: Use your tail comb again to create a one-inch square section of hair on the left side of your part. Begin a three-strand braid on this section. \n" +
                    n+"Step 3: Instead of using mini hair elastics, cinch the end of the braid by using your tail comb to tease up the ends. Firmly comb up from the ends of your hair to the end of your braid until there is enough tension in your hair to hold the braid in place. \n" +
                    n+"Step 4: Repeat Step 3 on the right side of your head. \n" +
                    n+"Step 5: Spray sea salt spray in the loose hair and use your fingers to scrunch the product into your hair. \n" +
                    n+"Step 6: Part the front section of hair down the middle and style the pieces into the rest of your hair."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Tucked Up</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Bobby pins\n" +
                    n+"Step 1: Take a one-inch section of hair from each side of your head and gather them together in the back, loosely securing them with a mini hair elastic. This section will act as an anchor for Steps 2–4. Underneath that section, gather the top half of your hair into a half-up ponytail. \n" +
                    n+"Step 2: Beginning on the right side of your head, take a one-inch section of hair and roll it up, over the top anchor of hair, and tuck it underneath the anchor. Secure it with a bobby pin.\n" +
                    n+"Step 3: Repeat Step 2 with another one-inch section of hair, continuing until all of your hair is secured up. \n" +
                    n+"Step 4: Use bobby pins to tuck away any stray hairs or cowlicks."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Triple Bun</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Bobby pins\n" +
                    n+"- Mini hair elastics\n" +
                    n+"Step 1: Separate your hair into three evenly sized low ponytails at the nape of your neck. Secure the base of the ponytails with mini hair elastics. \n" +
                    n+"Step 2: Use another mini hair elastic about two inches up from the ends of your hair on each ponytail. This will help keep the hair together and in place for the next step. \n" +
                    n+"Step 3: Starting with the ponytail in the center, roll the bottom elastic up to the first elastic to create a bun. Pin the bun in place at the base of the ponytail. \n" +
                    n+"Step 4: Repeat Step 3 on the left ponytail. \n" +
                    n+"Step 5: Repeat Step 3 on the right ponytail."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>The Crisscross</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Bobby pins\n" +
                    n+"- Texturizing finishing spray\n" +
                    n+"- Tail comb\n" +
                    n+"- Hair clips\n" +
                    n+"Step 1: Use texturizing finishing spray at your roots for a gritty texture that will help hold your hairstyle in place. \n" +
                    n+"Step 2: With your tail comb, section out a one-inch section of hair at the front of your hairline and clip out of the way. \n" +
                    n+"Step 3: Take a small, half-inch section of hair from the right side of your head by your temple and pull it around the back of your head. Pin it on the left side of your head with the bobby pin pointing straight down. \n" +
                    n+"Step 4: Repeat Step 3 on the left side of your head. \n" +
                    n+"Step 5: Continue Steps 3 and 4, alternating from left to right and working your way down the back of your head. \n" +
                    n+"Step 6: As you continue pinning, cover up each previous pin with a new half-inch section of hair. \n" +
                    n+"Step 7 (Optional): Use texturizing finishing spray on your loose hair for added texture. \n" +
                    n+"Step 8: Once you’ve finished the crisscross in the back, split the front section into two pieces wherever you naturally part your hair and pin each piece back."+
                    "</p>" +
                    ""+n+n+n+n+
                    "",
            "<h1><b>Wrap-Around Braids</b></h1>" +
                    "<p>" +
                    n+"What You’ll Need: \n" +
                    n+"- Mini hair elastics\n" +
                    n+"- Bobby pins\n" +
                    n+"- Reworkable hold paste\n" +
                    n+"Step 1: Split your hair into four sections: top, bottom, left, and right. Pin the bottom section up into a bun at the nape of your neck. Take the top section straight back and down, pinning underneath the bun. \n" +
                    n+"Step 2: Starting with the right section, braid the hair and secure with an elastic at the bottom. \n" +
                    n+"Step 3: Wrap the braid around the back of your head and pin to the opposite side of the bun. See the GIF below for more details on how to do this. \n" +
                    n+"Step 4: Repeat Step 2 on the left side. \n" +
                    n+"Step 5: Repeat Step 3 on the left side. \n" +
                    n+"Step 6 (Optional): Using a pea-size amount of reworkable hold paste in your fingertips, smooth down any sections of frizz or flyaways."+
                    "</p>" +
                    ""+n+n+n+n+
                    ""
    };


    private String imgBindiDec[] = {
            "bindi1",
            "bindi2",
            "bindi3",
            "bindi4",
            "bindi5",
            "bindi6",
            "bindi7",
            "bindi8",
            "bindi9",
            "bindi10",
            "bindi11",
            "bindi12",
            "bindi13",
            "bindi14",
            "bindi15",
            "bindi16",
            "bindi17",
            "bindi18",
            "bindi19",
            "bindi20"
    };

    private String txtBindiDec[] = {
            "<h1><b>The Vermillion Bindi</b></h1>" +
                    "<p>" +
                    "One of the most common ways of wearing a bindi is by using vermillion powder and the tip of your ring or ring finger. It is drawn in a circular motion and to master this type of bindi one needs a bit of practice and time. One also needs practice to place the bindi just at the centre of the forehead, right between the eyes, in a precise manner." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Stone Bindi</b></h1>" +
                    "<p>" +
                    "A variety of the self-sticking type of bindis which are then further decorated with shiny stones that sparkle when light fall on them. The number of stones and colours of the stones can also vary from one kind to the other. Most often, women prefer shiny silver stone bindis for parties and occasions.\n" +
                    "\n" +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Bollywood Inspired Bindi</b></h1>" +
                    "<p>" +
                    "Quirky and colourful bindis in abstract designs and forms are considered Bollywood inspired bindis because they are often flaunted by the stars and actresses in movies or award functions. They are often paired with designer clothes and accessories to fully suit the attire." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Coloured Bindi</b></h1>" +
                    "<p>" +
                    "Self adhesive bindis also come in different colours. They may have a single colour like red, black, blue, green, etc or they can also be dual toned or even multicoloured. You can choose from the styles and designs of these colourful bindis and match them as per your attire." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Traditional Round Bindi</b></h1>" +
                    "<p>" +
                    "This will be your go-to bindi design that you can flaunt any day in any season. It is more of a casual bindi that comes in different colours and can be used for both formal and regular occasions. The look of the bindi is quite simple. The only variation you can get is in terms of colours and sizes which vary from the smallest to the biggest that can cover your forehead." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Red Bindi</b></h1>" +
                    "<p>" +
                    "It is the typical copy of a vermillion bindi with the difference that instead of a vermillion you use a self adhesive kind of bindi in red or dark maroon colour to adorn your forehead. It is the most commonly used replacement of a vermillion bindi and works well for women who do wish to carry off the traditional look but do not want the mess and the smudges from a vermillion bindi that happens most often due to heat, sweat and other conditions." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Black Round Bindi</b></h1>" +
                    "<p>" +
                    "This is one bindi that can be adorned by both married and unmarried women, irrespective of their age and marital status. The round black bindi is an awesome complement for cotton sarees with golden border or salwar kameez that comes in simple looks and designs. The black round bindi also comes in various sizes to suit the occasions and wishes of the wearer." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Bridal Decorative Bindi</b></h1>" +
                    "<p>" +
                    "No bridal make up look is complete without a bindi and that too, which complements with the bridal attire of the bride. A bridal decorative bindi is quite prominent in size and has embellishments such as stones, sequins, glitter, sparkles and studs to make it even prettier. These bindis are elaborately designed to suit the occasion and can be stored in separate containers for months, to be used and re-used." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Paisley Designed Bindi</b></h1>" +
                    "<p>" +
                    "Inspired from paisley designs, these bindis look beautiful for grand occasions when you are really wishing to dress up nicely in your heavy sarees or lehangas. At that point, going plain Jane with your bindi is not a good thing to decide upon. You can choose these perfectly styled and designer paisley bindis that come in various combination of colours and sizes and complete your look perfectly in minutes." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>The Tika Bindi</b></h1>" +
                    "<p>" +
                    "The tika bindi is inspired from the roli tika that we get while visiting temples or during any festive occasions in our house involving worshipping the deities. It is applied using a liquid sindoor or a colour pigment, mostly in reds or maroons. First, the dot is placed and then it is trailed upwards towards the forehead for the complete design." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Sandalwood Paste Bindi</b></h1>" +
                    "<p>" +
                    "In many cultures of India, the ritual of using sandalwood paste for bindi and tika application is quite prevalent. Beautiful designs are created on the forehead and the cheeks, the chin, neck and around the shoulder for an elaborate look." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Alpona Design Bindi</b></h1>" +
                    "<p>" +
                    "It is a bindi design that is a must in every Bengali traditional wedding and the application of the bindi is included in the kone saaj ritual. The chandan or rice paste is used to make intricate designs on the forehead and face of the bride for a completly look." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Trail Bindi</b></h1>" +
                    "<p>" +
                    "The elongated design of a self adhesive bindi is called as a trail bindi which is sleek in design and can be styled with both traditional and western outfits, if you are looking a bit of a fusion style. They also come in various colours and shapes and are a must if you;re looking to experiment with various styles." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Sparkle Bindi</b></h1>" +
                    "<p>" +
                    "This bindi design is all about the glitter and shine, the bindi is decorated with really bright sparklers and glittering stones to add that look and drama to the bindi. If you are wearing very heavily worked attire, then you can opt for this bindi design. And if you are wearing something very simple, then you can glam up your look with this one." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Marathi Bindi</b></h1>" +
                    "<p>" +
                    "It is the traditional bindi design that is prevalent in the Marathi culture. The shape of the bindi consists of a crescent shaped moon and a line under it with a dot. The Marathi bindi is a must for occasions such as marriages and celebrations and you can see women flaunting this bindi with yellow saree, nathni and gajra." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Colourful Stone Pattern Bindi</b></h1>" +
                    "<p>" +
                    "Instead of using just a simple stone, this bindi design uses various types of stones in different colours to create a very fancy and shimmery effect. It is a perfect design that is awesome for parties, glamorous outings and other celebrations." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Layered Bindi</b></h1>" +
                    "<p>" +
                    "This layered design of the bindi is created using several small bindis taken together and held up in layers. You can style this bindi for both day and night outings. At the day time, you should stick to different colours only for layering. At night, you can glam up the look a little bit more by adding layers of glitter stone bindis to complete the look." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Crescent Shape Bindi</b></h1>" +
                    "<p>" +
                    "The shape of this bindi is a lot like the Marathi bindi except for the fact that it does not have any line and dot underneath it. It can be drawn or pasted and can come in various colours." +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Arrow Shaped Bindi</b></h1>" +
                    "<p>" +
                    "The design of the bindi is in the shape of an arrow. It can come in various colours and sizes, with or without glitters and makes a perfect catch for parties and occasions.\n" +
                    "\n" +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Mirrored Bindi</b></h1>" +
                    "<p>" +
                    "Tiny mirrors are placed on the bindi for added drama and as the light fall on the bindi, it. It sparkles in full glory, reflecting the light and can look awesome when worn with traditional clothing." +
                    "" +n+n+n+n+
                    "</p>"
    };


    private String imgBleach[] = {
            "bleach1",
            "bleach2",
            "bleach3"
    };

    private String txtBleach[] = {
            "<h1><b>Dangers of Using Household Bleach</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Understand the research. The recent trend for using household bleach on the face is believed to have started with a study conducted at Stanford University School of Medicine. This study found that diluted bleach helped to heal and renew the skin of mice with dermatitis.\n" +
                    "The object of this study was to find a solution for radiation dermatitis - an unpleasant skin condition that often affects patients undergoing chemotherapy and radiation treatment. However, researchers believe that in the future, bleach could also be a key ingredient in treating skin problems caused by sun damage and aging.\n" +
                    "Although this study indicates that bleach could be the answer to many skin issues, it is important to remember that the test subjects were mice, not humans. Human trials have yet to be conducted.\n" +
                    "In addition, the various applications of bleach as an ingredient in household beauty products requires further study." +n+n+
                    "<b>Step 2</b>" +n+
                    "Be aware that it is very difficult to achieve the correct dilution at home. Another point to take into consideration is the fact that the Stanford researchers used a very specific dilution rate in their study - .0005, to be exact.\n" +
                    "Most household bleaches have a concentration somewhere between 5% and 8%, making them significantly stronger than the solution deemed safe for use during the study.\n" +
                    "Even if you attempted to dilute bleach yourself before use, it would be very difficult to achieve a concentration of .0005 without the necessary knowledge concerning dilution methods, or the required tools.\n" +
                    "The effects of using a dilution higher than .0005 have not been studied, and could have an adverse effect on skin." +n+n+
                    "<b>Step 3</b>" +n+
                    "Understand that using bleach on the face is not recommended by doctors. Although medical researchers are currently looking into the applications of bleach in anti-aging and skin rejuvenation products, the use of household bleach as an at-home face cleanser is not recommended by doctors.\n" +
                    "In fact, many doctors would strongly advise against it. Dr. Mona Gohara, a professor of dermatology at Yale School of Medicine states \"Bleach is absolutely too irritating and should not be used as a face wash ... If used incorrectly, bleach can cause extreme inflammation and dryness.\"\n" +
                    "While Dr. Daniel Shapiro, a renowned Phoenix-based cosmetic surgeon has stated \"I wouldn't recommend trying the bleach facial at home ... I do see how bleach can be a potentially promising product for anti-aging ... But it will need a great amount of work.\"" +n+n+
                    "<b>Step 4</b>" +n+
                    "Know that bleach can burn and irritate the skin. Bleach is a corrosive substance - in fact, in high concentrations it can burn a hole through stainless steel.And even in low concentrations bleach can burn the skin, leaving it red, dry and irritated. Therefore, although the object of using bleach on your face is to to make it clear and glowing, you could very likely end up producing the exact opposite effect." +n+n+
                    "<b>Step 5</b>" +n+
                    "If you decide to go ahead with using bleach on your face, make sure to follow the proper safety precautions. Ensure that the bleach is highly diluted first. The dilution used by the Stanford researchers was less concentrated than the water in a swimming pool.\n" +
                    "As it is difficult to work with very tiny amounts of bleach, it is easier and safer to use a large quantity of water instead. Therefore, you should make the bleach solution a gallon jug by mixing 1/4 teaspoon of bleach with three quarts and 12 ounces of warm water.\n" +
                    "When it's ready, label the container clearly and mark with a skull and crossbones and poisonous. Store the jug where it can be stored for later use. Do not put the bottle of bleach in the refrigerator, or anywhere it could be mistaken for a beverage.\n" +
                    "Make sure to perform a patch test on a small piece of skin before applying the bleach solution to your entire face. Use a cotton pad to apply a dab of the bleach on the skin below the jawline. Wait 24 hours to see if any redness, dryness or irritation occurs before proceeding.\n" +
                    "If no irritation occurs and you decide to proceed with the bleach treatment, apply only a thin layer of the diluted bleach solution to the entire face (carefully avoiding the eyes, mouth and nostrils) and leave for a maximum of ten minutes.\n" +
                    "Thoroughly rinse the bleach from your face using a face wash and running water, then immediately moisturize the skin. If any irritation occurs, do not repeat the treatment.\n" +
                    "It is strongly advised that you consult with your doctor or dermatologist before using bleach on your skin. There are many safer, more effective options out there, whether you wish to target skin discoloration, acne or signs of aging." +n+n+
                    "" +n+n+
                    "</p>"+
                    "",
            "<h1><b>Using Alternative Skin Lightening Products</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Try specific facial bleaching creams. A much safer option than using household bleach is to use bleaching products designed specifically for the face. These products can be bought over-the-counter and often contain ingredients such as hydrogen peroxide, which is a well-known bleaching agent.\n" +
                    "Facial bleaching creams are designed to brighten the skin and hide unwanted facial hair. They should be used according to the instructions on the packaging.\n" +
                    "You should discontinue use of these products if any irritation occurs." +n+n+
                    "<b>Step 2</b>" +n+
                    "Consider using hydroquinone. Hydroquinone is an effective skin lightening cream which uses retinoids (acidic vitamin A) instead of bleach.\n" +
                    "It is mainly used for treating skin discoloration and dark spots, as it reduces melanin in the skin. Hydroquinone creams should only be used at night, as they make skin hyper-sensitive to UV light.\n" +
                    "Although 2% solutions of hydroquinone are available over-the-counter in the US (4% with a prescription), it is important to be aware that products containing hydroquinone have been banned in large parts of Europe and Asia due to their potential carcinogenic properties.\n" +
                    "As a result, you should consult with your dermatologist before using any hydroquinone products." +n+n+
                    "<b>Step 3</b>" +n+
                    "Use \"brightening\" creams. If you are simply looking to brighten your complexion and achieve a more youthful, dewy look, then brightening creams are the way to go.\n" +
                    "These creams are available over-the-counter and usually contain natural lightening agents such as kojic acid, glycolic acid, alpha hydroxy acids, vitamin C or arbutin.\n" +
                    "These ingredients also work to inhibit melanin production and reduce pigmentation in the skin, but they are safer than hydroquinone." +n+n+
                    "<b>Step 4</b>" +n+
                    "Wear sunscreen everyday. The sun is a major culprit when it comes to skin discoloration, dark spots and general signs of aging.\n" +
                    "Therefore, it is imperative that you protect your face from harmful UV rays by wearing sunscreen everyday.\n" +
                    "Simply by wearing sunscreen, you can protect your skin from becoming darker and prevent many of the skin problems associated with sun exposure, including skin cancer.\n" +
                    "You should wear a minimum of factor 30, and wear a hat to protect your face from direct sunlight. You should even wear sunscreen in winter, as harmful UV rays can penetrate clouds and cause damage, even if it's not hot. " +n+n+
                    "" +n+n+
                    "</p>"+
                    "",
            "<h1><b>Using Home Remedies</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Use lemon. The citric acid contained in fresh lemon juice is an effective natural bleaching agent and can be used to brighten the complexion and to minimize discoloration and the appearance of dark spots.\n" +
                    "Squeeze the juice from half a lemon and dilute to half strength with water. Dip a cotton ball into the liquid and dab onto the face, concentration on the areas you wish to brighten.\n" +
                    "Leave the lemon juice to sit for 10 to 15 minutes, then wash off with cold running water and apply a nourishing moisturizer (as lemon juice can be drying). Repeat several times a week for best results.\n" +
                    "A word of warning - never expose your skin to sunlight while the lemon is juice is on your face, the citric acid makes your skin extra sensitive and increases the risk of sun damage." +n+n+
                    "<b>Step 2</b>" +n+
                    "Try yogurt and turmeric. Turmeric has been used in Indian skincare for hundreds of years, thanks to it's smoothing, lightening, anti-aging and anti-inflammatory properties.\n" +
                    "To make a mask that won't stain your skin, mix 1 teaspoon of turmeric with 2 teaspoons of rice flour and 3 tablespoons of plain yogurt (or milk or cream).\n" +
                    "Apply the mask to your face and leave to sit for 10 to 15 minutes, until hard. Rinse off with warm water, using a gentle scrubbing motion." +n+n+
                    "<b>Step 3</b>" +n+
                    "Use aloe vera. Aloe vera is a gentle, moisturizing natural substance which soothes red, inflamed skin and helps to fade discoloration.\n" +
                    "To use, simply snap a leaf from an aloe vera plant and squeeze to produce a clear, gel-like sap. Rub this sap all over your face and leave to sit on your skin for as long as you like.\n" +
                    "Aloe vera is extremely gentle and safe to use, so you can apply the sap as often as you like." +n+n+
                    "<b>Step 4</b>" +n+
                    "Try raw potato. Due to its high vitamin C content, the juice from potatoes is believed to work as a skin lightener. Vitamin C is used in many skin lightening products.\n" +
                    "To try it, simply cut a well-washed potato in half, then rub the exposed flesh over the skin you wish to lighten. Leave for 10 to 15 minutes, then wash off.\n" +
                    "Cucumbers and tomatoes are believed to have similar skin-lightening properties, as they also contain high quantities of vitamin C." +n+n+
                    "" +n+n+
                    "</p>"+
                    ""
    };


    private String imgSareeDrape[] = {
            "saree1",
            "saree2",
            "saree3",
            "saree4"
    };

    private String txtSareeDrape[] = {
            "<h1><b>Wearing it Nivi Style</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Start with having the right clothing on. You'll want to have your shirt or top on (such as a choli), your petticoat (sometimes called an inskirt) on and tied snug, and your shoes on before you start wrapping.\n" +
                    "The top worn with a saree is typically known as blouse (choli).\n" +
                    "While not necessarily required, safety pins make all sari wrapping much easier and better looking." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Wrap and tuck the starting end. Hold the sari so that the shorter distance goes from your waist to the floor and the long end can be wrapped around. Then, start at one end and tuck the corner of the fabric into your petticoat at your left hip, wrap it around behind you, over your right hip, past your navel, and around again until it reaches your navel once more. Continue to tuck it into your petticoat as you go around like this.\n" +
                    "Ensure sari is not too high. Ideally, your feet should not be visible from under the sari hem.\n" +
                    "You can use a safety pin to pin it into place at your waist right now, but the petticoat should be secure enough to hold it in place." +
                    "" +n+n+
                    "<b>Step 3</b>" +n+
                    "Pleat the other end. Switch to the other, more decorated end of the sari (called the pallu). You'll want to make the pleats that go over your shoulder. Do this by using your fingers span to space the pleats, and fold them across the short end of the sari.\n" +
                    "You can use a flat hair clip to keep the pleats in place until you're done with your look. Just don't forget to remove it later!" +
                    "" +n+n+
                    "<b>Step 4</b>" +n+
                    "Drape and secure the pleated end. Reach the pleated section around behind you and drape the pleated end from the right hip and then over your left shoulder. Adjust it to the length you want and then pin it to the shoulder strap of your choli or top." +
                    "" +n+n+
                    "<b>Step 5</b>" +n+
                    "Cover and tuck the hip. Pulling the fabric from the top left of the skirt until it is taut at the back, drape it diagonally so that it covers your exposed love handle (or place where a love handle would be) and then tuck the fabric into the waistband at the navel." +
                    "" +n+n+
                    "<b>Step 6</b>" +n+
                    "Pleat the remainder of the fabric. Adjust the fabric so that you have a loop in front of you of the fabric that is making up the waistline. Pleat this remaining fabric to reduce the size of the loop until it fits your waist. You do not need to pleat until it is very tight; a little loose fabric is desirable." +
                    "" +n+n+
                    "<b>Step 7</b>" +n+
                    "Tuck and pin the pleats. Pin the front skirt pleats together at the top, adjust them to match the length of the front of the skirt, and then tuck them into the waistband. " +
                    "" +n+n+
                    "<b>Step 8</b>" +n+
                    "Pin it in place as necessary. You can pin your sari in more places if you want to make it more secure. A pin at the armpit on the right can help make sure it stays draped over your right breast, for example." +
                    "" +n+n+
                    "" +n+n+
                    "</p>",
            "<h1><b>Wearing it Gujarati Style</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Start with having the right clothing on. You'll want to have your shirt or top on (such as a choli), your petticoat (sometimes called an inskirt) on and tied snug, and your shoes on before you start wrapping.\n" +
                    "While not necessarily required, safety pins make all sari wrapping much easier and better looking." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Wrap and tuck the starting end. Hold the sari so that the shorter distance goes from your waist to the floor and the long end can be wrapped around. Then, start at one end and tuck the corner of the fabric into your petticoat at your left hip, wrap it around behind you, over your right hip, past your navel, and around again until it reaches your navel once more. Continue to tuck it into your petticoat as you go around like this.\n" +
                    "You can use a safety pin to pin it into place at your waist right now, but the petticoat should be secure enough to hold it in place." +
                    "" +n+n+
                    "<b>Step 3</b>" +n+
                    "Create the front pleats. With the fabric at your navel, make six-seven pleats. Adjust the pleats to face to the right side and then tuck in the pleats. Tuck any fabric necessary to get a clean look on the right hip." +
                    "" +n+n+
                    "<b>Step 4</b>" +n+
                    "Pleat the other end. Switch to the other, more decorated end of the sari (called the pallu). You'll want to make the pleats that go over your shoulder. Do this by using your fingers span to space the pleats, and fold them across the short end of the sari.\n" +
                    "You can use a flat hair clip to keep the pleats in place until you're done with your look. Just don't forget to remove it later!" +
                    "" +n+n+
                    "<b>Step 5</b>" +n+
                    "Place the shoulder pleats. Wrap the pallu end around behind you and then drape it over the right shoulder. It should reach down to around the top of your leg, but you can adjust it to whatever suits you. Pin the pallu in place at the shoulder to secure it." +
                    "" +n+n+
                    "<b>Step 6</b>" +n+
                    "Shift the pleats. Take the left side of the pleats and draw them over to your left hip. Pin the corner in place there." +
                    "" +n+n+
                    "<b>Step 7</b>" +n+
                    "Adjust and pin any fabric as necessary. Adjust any fabric that remains until it looks tidy and ready to go. You can pin it in more places if you want the style to be more secure." +
                    "" +n+n+
                    "" +n+n+
                    "</p>",
            "<h1><b>Wearing it Indo-Western Style</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Start with having the right clothing on. With this style, you'll mix Indian and Western styles by wearing leggings or jeggings instead of a petticoat, and a clubbing style or other fancy top instead of a choli. Again, be sure to have your shoes on before you start wrapping." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Make a pleated section. Begin pleating down the long side of the sari until you have a decent sized section of pleats." +
                    "" +n+n+
                    "<b>Step 3</b>" +n+
                    "Tuck in the pleated section. Tuck the pleated section into the waistband, centered below your navel, such that the rest of the sari is coming from the innermost pleat and to the left. Then tuck along the waist further, until it reaches your spine or just to your right side." +
                    "" +n+n+
                    "<b>Step 4</b>" +n+
                    "Pleat the other end. Switch to and pleat the other end of the sari as normal, across the short side." +
                    "" +n+n+
                    "<b>Step 5</b>" +n+
                    "Wrap the shoulder section. Pass the shoulder section behind you and then wrap it so that it passes from your right hip and then over your left shoulder." +
                    "" +n+n+
                    "<b>Step 6</b>" +n+
                    "Adjust the fabric. Adjust the hang of the sari so that a deep U is created at the right hip and the shoulder pleats hang at a level that pleases you." +
                    "" +n+n+
                    "<b>Step 7</b>" +n+
                    "Pin it in place as needed. Pin it at your shoulder to keep the sari in place, as well as anywhere else you need to in order to get the drape you want. Enjoy your new sari style!" +
                    "" +n+n+
                    "" +n+n+
                    "</p>",
            "<h1><b>Wearing it Bengali Style</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Tuck the saree in your waist. Start the tuck on the right side of your waist, and wrap it all the way around your body until it comes back to the right side of your body. As the edge runs along your waist, you can gently tuck in the entire edge, so the saree has a secure fit.\n" +
                    "The bottom border of the saree should graze the top of your feet, and should look horizontally straight and parallel to the ground." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Pleat the saree by tucking it back and forth. Once you have wrapped the saree once around your waist and tucked it on your right side hip, take the continued edge of the cloth, and tuck it into the left side of your waist. Then, reverse the direction, folding the saree back on itself from the left, and tuck it again on the right side of your waist. Moving from the right tuck, bring the cloth back across the front of your waist, and tuck it again on the left side. Do this one more time, moving from the left tuck, and tuck it again on your right side waist.\n" +
                    "This back and forth folding is called box pleating the saree. When you are finished pleating the saree, the fabric should lay evenly and perpendicular to your body.\n" +
                    "Overall, after the initial full body wrap, you will tuck the saree twice on your left side and twice on your right side." +
                    "" +n+n+
                    "<b>Step 3</b>" +n+
                    "Fold the remaining saree to make pleats. Pick the saree up from the shorter edge (the end that is not coming directly from the tucked portion), and hold it vertically at the corner. Start folding the saree in 4-5 inch sections, folding and layering the saree back and forth using your thumb and pinky finger to hold the fabric in place. Be careful to take your time and make clean, even folds.\n" +
                    "Make sure that the ends of the folds finish on opposite sides of the pleat. For example, if the beginning, top corner of the pleat starts on the right side, then the end, bottom corner of the folding should finish on the left side." +
                    "" +n+n+
                    "<b>Step 4</b>" +n+
                    "Throw the folded section over your left shoulder. The end of the saree is called a pallu. The folded pallu will now be thicker since it’s folded. Position the pallu over your left shoulder, pulling up from the front, bottom part of the saree so the pallu can be completely draped over your shoulder. The bottom of the pallu behind your shoulder should fall somewhere in between mid calf to lower calf length.\n" +
                    "Make adjustments so that the decorated bordering of the saree is fully visible and relatively straight and vertical." +
                    "" +n+n+
                    "<b>Step 5</b>" +n+
                    "Ornament the other hanging end of the saree. From the pallu hanging behind your back, grab the corner of the top fold. This corner is the corner facing outward, shown to the world, not the corner facing your back. Pull this corner from the left side of your body, to the right side, and bring it underneath your right arm, so it is now in front of your body. Attach a trinket to this corner of the saree. You can use a safety pin to securely attach the trinket to cornered pallu.\n" +
                    "Traditionally, the trinket has been a heavy house key, but any kind of weighted decoration will do." +
                    "" +n+n+
                    "<b>Step 6</b>" +n+
                    "Position the decorated corner of the saree. Once you have attached your trinket, and the decorated corner is in front of the right side of your body, drape it over your right shoulder. The trinket should fall at around the top to mid portion of your back." +
                    "" +n+n+
                    "" +n+n+
                    "</p>"
    };


    private String imgDye[] = {
            "dye1",
            "dye2",
            "dye3",
            "dye4"
    };

    private String txtDye[] = {
            "<h1><b>Supplies Needed</b></h1>" +
                    "<p>" +
                    n+"Get set up. Drape a towel around your shoulders. Put on a pair of disposable gloves. Mix the dye according to the package. ↓\n" +
                    n+"Divide your hair into four sections. Secure them with clips. ↓\n" +
                    n+"Start dyeing your hair. Apply the dye to 1/4 to 1/2-inch sections. ↓\n" +
                    n+"Set the timer for whatever time specified on the package. ↓\n" +
                    n+"Rinse your hair with warm water when the time is up. Follow up with shampoo and conditioner. ↓\n" +
                    n+"Dry and style your hair as usual. Wait at least two weeks before coloring again. ↓" +
                    "" +n+n+n+n+
                    "</p>",
            "<h1><b>Getting Ready</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash your hair 24 to 48 hours before dyeing. Doing this allows the natural oils in your hair to develop which in turn allows the dye to bind to your hair more easily. The dye will blend more naturally with your hair, and that tends to make it last longer.\n" +
                    "If possible, avoid conditioner when you wash your hair the day before dyeing it. Conditioner eliminates your natural oils, which you need for the dye to set in more easily.\n" +
                    "If your hair is extremely dry, condition it every night for at least five minutes in a hot shower for a week before you plan to dye your hair. Then, do not condition your hair the night before dyeing. This will keep your hair from drying out after you dye it." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Pick a color that you really like. It’s easy to get overwhelmed by the hundreds of shades you can choose from. If this is your first time dyeing your hair, its best to stick to a hair dye that is no more than two shades darker or lighter than your own natural hair color.\n" +
                    "If you are new to dyeing, you can also try dyeing your hair with a temporary or semi-permanent dye first. Using one of these types of dyes ensure that if you mess up, you won’t have live with your mistake for long. Keep in mind that you have to apply semi-permanent dye to damp hair.\n" +
                    "Temporary dyes usually wash out after 6 to 12 shampoos. Semi-permanent dyes will rinse out after 20 to 26 shampoos. Permanent dyes generally last for six to eight weeks, but can sometimes last for longer." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Protect your home and yourself from dye stains. While you want to stain your hair, you do not want weird blotches of cherry red all over your carpet and favorite shirt. Cover any surface around you that might get dye on it and put newspapers on the floor. Have paper towels nearby to deal with spills. Wear a ratty old shirt you do not like, preferably one you are ready to throw away. It is very easy to get dye on whatever shirt you are wearing." +
                    "" +n+n+
                    "<b>Step 4</b>" +n+
                    "Put a towel or color cape around your shoulders. The towel or cape will catch any dye that may drip off of your hair during the dyeing process. You can purchase a color cape at a beauty supply store. If you decide to use a towel, use one that is a dark color to avoid visibly staining the towel. Secure the towel in the front of your neck with a safety pin or clip." +
                    "" +n+n+
                    "<b>Step 5</b>" +n+
                    "Brush your hair well. Make sure that there are no tangles left in your hair. This step will make applying the dye easier, but it will also help you to make sure that your hair will be evenly dyed." +
                    "" +n+n+
                    "<b>Step 6</b>" +n+
                    "Coat your hairline, ears and neck before applying dye to your hair. You can use Vaseline, lip balm or the conditioner included in the kit (if one is provided). This step is optional, but applying this coating will make it easier to rinse off any dye that gets on your skin." +
                    "" +n+n+
                    "<b>Step 7</b>" +n+
                    "Put on your gloves. Gloves generally come with a dye kit, but if they don’t, you can simply use normal rubber, vinyl, or latex gloves. Remember that it is imperative to wear gloves when dyeing your hair. If you do not, you will end up dyeing your hands as well." +
                    "" +n+n+
                    "<b>Step 8</b>" +n+
                    "Use the supplied bottle or a bowl to mix the dye. Follow the directions provided on the box. Most box kits include bottles that you use for mixing the dye. Follow the instructions to combine the dye ingredients into the bottle provided. Then, shake the solution until the ingredients are well combined. If your dye does not include these items, then you will need to purchase a bowl to mix the dye in.\n" +
                    "If your hair dye does not come with a paint brush, you can buy one at your local beauty supply store or just use your gloved fingers to apply the dye." +
                    "" +n+n+
                    "<b>Step 9</b>" +n+
                    "Mix your dye with a developer. This only applies to some dyes - the box your dye came in will have instructions regarding developer. The developer is generally included in the kit. If it is not, you can purchase it at your local drugstore.\n" +
                    "If you need to purchase your own developer, choose a 20% developer." +
                    "" +n+n+
                    "" +n+n+
                    "</p>",
            "<h1><b>Dyeing Your Hair</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Use a comb to separate your hair into four different sections. Use large salon clips (found at your local drugstore) to hold the sections apart. Separating your hair into these sections will ensure that you don’t miss a patch of hair." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Apply the dye to your hair in sections. Break each section of hair up into smaller 1/4\"-1/2” subsections as you work (this will just make your dye job more even.) Use the applicator bottle or brush to dispense the dye onto your hair. Use your gloved fingers to work the dye into your hair. Whether to begin applying the dye will depend on whether or not you have ever dyed your hair before.\n" +
                    "For virgin (first time dyeing) hair, start applying dye about 1 inch from your roots.\n" +
                    "For touch-ups, start applying dye about ½ inch from your roots.\n" +
                    "Work the dye into your hair well so that you do more than simply color the top layer of your hair." +
                    "" +n+n+
                    "<b>Step 3</b>" +n+
                    "Set a timer for how long you need to leave the dye in your hair. Follow the instructions on the box. Do not rinse the dye out before the minimum time or leave the dye in past the maximum time. Make sure to follow the directions exactly. If you have a lot of grey hair, it’s best to leave the dye in for the maximum amount of time.\n" +
                    "Never leave hair dye in overnight. Leaving it in overnight will dry out your hair and it may cause severe skin irritation as well." +
                    "" +n+n+
                    "" +n+n+
                    "</p>",
            "<h1><b>Rinsing Your Hair</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wipe excess dye off of your neck and forehead with a paper towel or wet cloth. Do not disturb the dye in your hair. If you want, you can put a shower cap on your hair to keep the dye from going everywhere.\n" +
                    "Once you have put a shower cap on, you can wrap your head in a towel so that the cap retains the heat of your head. This will speed up the dyeing process." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Wait until the process time is up to rinse your hair. After your time is up, either get into the shower or use a sink to rinse your hair out. Use warm water to rinse the dye out of your hair. Rinse your hair until the water runs clear.\n" +
                    "Don't panic if you see the color run in the shower - this is totally natural and does not mean you’ve messed up the dyeing process. Keep in mind that if the dye is temporary, the dye will continue to run each time you wash it until it is completely gone." +
                    "" +n+n+
                    "<b>Step 3</b>" +n+
                    "Shampoo and condition your hair. Wait at least an hour before shampooing your hair. Waiting to wash allows the dye to more thoroughly penetrate your hair shaft. After you have shampooed your hair, use the conditioner that came with the dye kit. Rub it thoroughly into all of your hair. \n" +
                    "Almost every kit comes with conditioner, but if yours did not you can just use what you have at home." +
                    "" +n+n+
                    "<b>Step 4</b>" +n+
                    "Dry your hair and style as usual. You can either blow dry your hair or let it air dry. After your hair is dry, style it as you normally would and show off your new hair color! If you are unhappy with your results, you may want to see a hair stylist for color correction. It is also a good idea to wait at least two weeks to color your hair again." +
                    "" +n+n+
                    "" +n+n+
                    "</p>"
    };


    private String imgBlowDry[] = {
            "blowdry1"
    };

    private String txtBlowDry[] = {
            "<h1><b>Rinsing Your Hair</b></h1>" +
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "\n" +
                    "Wash your hair. Use your regular shampoo, but for better blow drying effects and |protection, try washing with a moisturizing shampoo (dry hair formula, as it's often called). This type of shampoo will provide extra moisture that will protect your hair from the effects of the blow dryer. It will also protect it from any other heat caused by straightening or curling, and generally add more moisture to your locks. You don't have to buy a super expensive brand - moisturising shampoos are available just about anywhere for all kinds of prices, so look around and secure the best deal for you." +
                    "" +n+n+
                    "<b>Step 2</b>" +n+
                    "Towel off your hair slightly, just enough to stop the dripping. Don't rub your hair with the towel, as the friction can cause split ends and frizzy dryness. Instead, gently wrap the towel around your hair and squeeze, like blotting the water out of your hair. If you have hair that's too short a length for that technique, wrap the towel around your head and rub very very gently using strong, circular motions. Don't rub too fast or hard, and if you can feel pain or hair breaking, then use your common sense and stop. Your hair doesn't have to be very dry at all after toweling; it just shouldn't be excessively soaked and dripping everywhere." +
                    "" +n+n+
                    "<b>Step 3</b>" +n+
                    "Separate your hair into sections. The bigger the section, the longer it will take to dry. It's best to go for four to six sections, but make sure that nothing is tangled. If you have thick or longer hair, try using clips to help. If your hair's a bit too short, you may want to just part it into two sections." +
                    "" +n+n+
                    "<b>Step 4</b>" +n+
                    "Start blow drying at the top/roots, about six inches (15cm) away from your scalp. Maintain this distance throughout, so nothing burns. Never blow dry in an upwards motion, as this causes more damage. Plus, by drying the hair on your scalp, it prevents the moisture from soaking the rest of your hair." +
                    "" +n+n+
                    "<b>Step 5</b>" +n+
                    "Work your way down the hair sections. Remember to move the blow dryer around, again, to avoid focusing too much heat on one area. If you simply focus the dryer on one spot for too long it will dry out and may even burn the hair, rather than drying it gently." +
                    "" +n+n+
                    "<b>Step 6</b>" +n+
                    "Leave your hair a little bit damp. Don't dry the hair until your whole head of hair is completely dry; leave in some moisture, so that your hair won't dry out, and become frizzy or damaged. Leave it tolerably damp, not so it soaks your clothes, but so it will dry naturally in about 5 to 10 minutes." +
                    "" +n+n+
                    "<b>Step 7</b>" +n+
                    "Finish with a blast of cold air. This will help to to lock in shine. Brush through your hair gently, or de-tangle it with your fingers. If needed, apply a moisturizing or anti-frizz serum and brush it through evenly. You can even use a tiny bit of olive oil for a more \"natural\" option. These will work to keep your locks shiny and smooth, and now, dry, all day long!" +
                    "" +n+n+
                    "" +n+n+
                    "</p>"
    };





    //Data Of Home Beauty care












    private String imgFaceCare[] = {
            "face_care",
            "facecare1",
            "facecare2",
            "facecare3",
            "facecare4",
            "facecare5",
            "facecare6",
            "facecare7",
            "facecare8",
            "facecare9"
    };

    private String txtFaceCare[] = {
            "<h1>Content:</h1>"+n+
                    "1.Pimples Cure"+n+
                    "2.Lips Care"+n+
                    "3.Home Made Facepacks"+n+
                    "4.Glowing Face"+n+
                    "5.Dark Spots Cure"+n+
                    "6.Dark Circle Cure"+n+
                    "7.Sparkling Eyes"+n+
                    "8.Face Cleanser"+n+
                    "9.Lightening Tan"+n+
                    "",
            "<h1><b>1.Pimples Cure</b></h1>"+n+
                    "<h2>Washing Your Face Properly</h2>" +
                    "" +n+
                    "<p>" +
                    "<b>Step 1</b>"+n+
                    "Select the right cleanser. You'll want a gentle face wash that is non-abrasive. Make sure that any product you use is free of alcohol to prevent further skin irritation. If you're unsure of what the best cleanser for you would be, ask your dermatologist for a recommendation." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>"+n+
                    "Wet your face with lukewarm water. Cold water will close up your pores. While washing your face, you'll want your pores open so dirt, oil, and bacteria will flow out of your skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>"+n+
                    "Apply the cleanser to your face. Be sure to only use your fingertips when applying the cleanser. A washcloth or sponge will irritate your skin.\n" +
                    "Do not scrub your skin while washing your face. This will also irritate your face. Just apply the cleanser and allow it to sit for a minute or so." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>"+n+
                    "Rinse with lukewarm water. Again, make sure to use warm water to keep the pores open and allow dirt and bacteria to flow out of your skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>"+n+
                    "Pat your skin dry with a clean towel. Do not rub your face with the towel. This can irritate your skin. Rubbing will also spread around bacteria and dirt, making your acne worse. Instead, just gently pat your face with the towel." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>"+n+
                    "Apply a moisturizer if necessary. While many people with acne would avoid moisturizers, your skin still needs moisture to stay healthy. Washing your face can lead to dryness. If you notice redness, burning, or itching, your skin may be dried out. Gently apply an oil-free moisturizer with your fingertips to help fight dryness after washing." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>"+n+
                    "Limit washing to twice a day, or after sweating. While it may seem like more washing would be better for your acne, this isn't true. Washing too much will strip your skin of essential oils, which will dry out your skin and can even lead to premature aging. Repeat these steps only twice a day, morning and night. You should also wash your skin after sweating, since this can lead to breakouts." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "<h2>Using Common Natural Remedies for Treating Acne</h2>" +
                    "" +n+
                    "<p>" +
                    "<b>Step 1</b>"+n+
                    "Use Australian tea tree oil. Tea tree oil is a pleasant-smelling essential oil derived from a tree native to Australia. There is clinical evidence that tea tree oil is effective against several skin conditions, including acne. It works as a natural astringent and can stimulate the immune system, making it an asset for your fight against acne.\n" +
                    "See How to apply for detailed instructions on how to use and apply tea tree oil.\n" +
                    "Some people may be allergic to tea tree oil. Before using it on your face, test a drop of tea tree oil elsewhere, like your arm or leg. Wait several hours. If a rash develops, you may be allergic or sensitive to the oil, and should avoid putting it on your face.\n" +
                    "Tea tree oil is toxic when consumed. Do not ingest tea tree oil." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>"+n+
                    "Use lemon juice on pimples. Lemon juice works as a natural disinfectant, which will kill bacteria that cause acne. It can also stimulate circulation to the skin, which will bring essential nutrients from your body to help fight acne. Follow these instructions to treat your acne with lemon juice.\n" +
                    "Wash your face normally.\n" +
                    "Squeeze a large lemon into a bowl until you have about 2 teaspoons. Note that you may need to use a second lemon. Make sure to get the lemon juice by squeezing lemons instead of using store-bought juice- this usually contains preservatives that can irritate your face.\n" +
                    "Use a cotton ball or Q-tip to apply the lemon juice to each one of your pimples.\n" +
                    "If you do this treatment during the day, leave the juice on for at least 30 minutes, then rinse with cool water. If you are doing it at night, leave it on while you sleep, then wash it off with cool water in the morning.\n" +
                    "Make sure you've removed the juice before going into the sun, as this can have a bleaching affect on your skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>"+n+
                    "Experiment with honey. Although there is conflicting evidence, some consider honey an effective treatment for acne because of its antibacterial properties. Advocates consider Manuka honey, harvested from New Zealand, and raw honey, to be the two best forms of honey for acne treatment. Both are available in health food stores and on the internet.\n" +
                    "Before applying honey to your acne, dab a small amount around your jawline. Wait about 30 minutes to see if you have an adverse reaction. If so, do not apply honey to your acne.\n" +
                    "You may use honey in two ways. Either dab your pimples, or apply the honey to your whole face like a mask.\n" +
                    "Wash off the honey with cool water after 30 minutes, though you may leave it on longer if you want.\n" +
                    "You could also add about 1/2 teaspoon of cinnamon to your honey. This adds to its antibacterial properties and can promote circulation in your face." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>"+n+
                    "\n" +
                    "Mix up an apple cider vinegar toner. Apple cider vinegar helps to balance your skin's pH, leading to less blemishes and a more even tone. It also kills bacteria and can soften your skin. It is very simple to mix up a toner from apple cider vinegar.\n" +
                    "Thoroughly clean a glass bottle to store your toner in. Use only hot water and soap. Cleaning with alcohol or bleach could leave chemical residue in the container, which can then get on your face.\n" +
                    "Pour 1/2 cup of apple cider vinegar and 1/2 cup of water into the container. Cover the bottle and shake to mix the ingredients well.\n" +
                    "Apply the toner to pimples using a cotton ball.\n" +
                    "Store the mixture in a cool, dry, dark place.\n" +
                    "You could try applying apple cider vinegar to your skin without diluting it, but this is not recommended. The apple cider vinegar is harsh and can cause irritation if not diluted. If this mixture causes any irritation, try diluting with more water." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>"+n+
                    "Mix a turmeric treatment. This yellow-tinged spice, common in Middle-Eastern cooking, is available wherever spices are found. It is usually considered an effective home remedy for acne. Follow these simple steps to mix your own turmeric paste and treat your acne.\n" +
                    "Add 1/4 teaspoon of powdered turmeric to 2 teaspoons of coconut oil. Stir the mixture well.\n" +
                    "Spread the mixture evenly on your face.\n" +
                    "Let the mixture sit 15 minutes. Then rinse with cool water.\n" +
                    "Remember that turmeric stains your skin yellow, especially if you leave it on overnight. For advice on how to get rid of turmeric stains, look here." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>"+n+
                    "Rub tomatoes on your acne. Naturally rich in antioxidants and vitamins A and C, tomatoes are another simple acne remedy available at any food store. Tomatoes also tighten the skin's pores and shrink pimples. Application is easy and takes very little time.\n" +
                    "Slice a small tomato in half.\n" +
                    "Rub the opened half over areas of the skin where acne is present. Discard the tomato afterward.\n" +
                    "Massage the juice into your skin for a few seconds.\n" +
                    "Rinse your face with warm water afterward.\n" +
                    "Apply twice a day for best results, using the other half of the tomato for the second application." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>"+n+
                    "Make a sea salt mixture. Sea salt can help dry out your pimples and absorb excess oil. Mixed with honey, it can be an effective home remedy for acne.\n" +
                    "Mix 1 teaspoon of sea salt with 3 teaspoons of hot water.\n" +
                    "Stir the mixture until the salt dissolves.\n" +
                    "Add 1 teaspoon of honey and stir well.\n" +
                    "Apply this mixture to your face when it has sufficiently cooled. If you only want it on your pimples, you can use a Q-tip to apply it as a spot treatment.\n" +
                    "Leave the mixture on for 10 minutes. Avoid keeping it on any longer or your skin will get too dry.\n" +
                    "Rinse off with cool water.\n" +
                    "Apply moisturizer. Sea salt may leave your skin dry, so applying a moisturizer is important to keep your skin healthy." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 8</b>"+n+
                    "Use an egg white mask. Egg whites can help tighten the skin's surface and reduce the size of pores. They also fight discoloration associated with acne.\n" +
                    "Wash your face using the steps from Part 1, except don't moisturize yet.\n" +
                    "Crack 3 eggs and separate the yolks from the whites.\n" +
                    "Add one tablespoon lemon juice if desired. This addition can help loosen blackheads and whiteheads.\n" +
                    "Whisk the egg whites until they become a foam.\n" +
                    "Apply this evenly to your face and leave on for 15 minutes.\n" +
                    "Rinse off with warm water and pat your face dry with a towel.\n" +
                    "Now moisturize your skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 9</b>"+n+
                    "Apply a yogurt mask to your face. Yogurt helps open up pores, exfoliate the skin, and absorb excess oil.\n" +
                    "Take one tablespoon of plain yogurt and apply it evenly across your face.\n" +
                    "Leave this on for 15 minutes, then rinse off with cool water.\n" +
                    "You can repeat this treatment daily." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "<h2>Using Common Chemical Home Remedies for Acne</h2>" +
                    "" +n+
                    "<p>" +
                    "<b>Step 1</b>"+n+
                    "Apply baking soda to your pimples. Baking soda can help balance your skin's pH level and absorb excess oil. It can dry out pimples, causing them to shrink and eventually disappear. Mixing up a baking soda paste is simple.\n" +
                    "Mix 2 tablespoons of baking soda with a few drops of water. Stir this mixture until it forms a paste.\n" +
                    "Apply this paste to areas of your skin affected by acne.\n" +
                    "Let the mixture sit for 15 to 20 minutes, then rinse it off with lukewarm water.\n" +
                    "Apply a moisturizer to your face, since baking soda can dry out your skin.\n" +
                    "Before using this treatment, apply a small amount to your jawline or another area on your face. Wait a few minutes and see if you have an adverse reaction. If so, don't continue using it." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>"+n+
                    "Use white toothpaste on your acne. Toothpaste is a common treatment option for people suffering from acne. Using white toothpaste instead of gel may be an effective treatment for your acne.\n" +
                    "Dab a tiny amount of white toothpaste onto the affected pimple.\n" +
                    "Let this sit for 10 to 15 minutes.\n" +
                    "Wash it off with warm water." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>"+n+
                    "Mix up an aspirin pill paste. Aspirin contains salicylic acid, a common anti-inflammatory in many OTC acne medications. It can also exfoliate the skin and flush out dirt and bacteria.\n" +
                    "Take a low dosage of aspirin, usually 2 pills (81mg each), and place them in a bowl. Crush them into a powder.\n" +
                    "Add a few drops of water and stir until you get a paste.\n" +
                    "Apply this paste to your pimples.\n" +
                    "Leave the mixture on your face for 15 minutes.\n" +
                    "Rise off with warm water.\n" +
                    "If your skin has any adverse reaction to the aspirin paste, rinse it off immediately and stop use." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "<h2>Treating Acne with Proper Diet</h2>" +
                    "" +n+
                    "<p>" +
                    "<b>Step 1</b>"+n+
                    "Drink plenty of water throughout the day. Water is one of your skin's absolutely essential needs. Water flushes toxins out of your body and also improves circulation, both of which are helpful in the fight against acne. Drink water whenever you become thirsty. A good rule of thumb to use is looking at the color of your urine: if it's mostly clear, you've had enough water; if it's yellowish, aim to get more water in your diet." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>"+n+
                    "Eat enough good fats. While fatty foods are often considered bad for acne, there are good fats that help fight acne. Omega-3 fatty acids help keep the skin flexible, which drains sebum out of the pores. This will cut down on the oil that is associated with acne.\n" +
                    "For good fats, eat nuts, cold-water fish, and avocados." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>"+n+
                    "Include proteins in your diet. The body uses the amino acids from protein to produce collagen. This nutrient helps keep the skin healthy and hydrated.\n" +
                    "Good sources of protein include seafood, poultry, dairy products, and eggs, as well as beans and soy." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>"+n+
                    "Eat vitamin A. This particular vitamin helps cut down on the oil your skin produces. Good sources include sweet potato, carrots, dark green vegetables, and sweet peppers." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>"+n+
                    "Cut artificial sugars out of your diet. Sugar stimulates levels of insulin in your blood, which can in turn increase the amount of oil your skin produces. Limit your intake of junk foods and soft drinks to cut the amount of sugar in your system." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "<h2>Treating Acne Naturally with Lifestyle Changes</h2>" +
                    "" +n+
                    "<p>" +
                    "<b>Step 1</b>"+n+
                    "Reduce your stress level. Scientific evidence finds a correlation between a high stress level and acne breakouts. The same cells that make sebum, which is the oily substance that gives you acne, have receptors for stress hormones. This can lead to breakouts when you're feeling overwhelmed. There are a multitude of activities you can use to cut your stress, which is beneficial for your health overall.\n" +
                    "Meditation. Spend just a few minutes a day sitting with your eyes closed and focusing on your breathing. This will help your body and mind unwind, reducing your stress levels and hopefully cutting down on your acne.\n" +
                    "Listen to music. While soothing music helps your body relax and stay calm, any playlist of music you enjoy can distract you from your stress and put you in a positive mood.\n" +
                    "Exercise. This will release endorphins and put you in a better mood. Even a simple walk is enough to de-stress your body and mind.\n" +
                    "Don't bottle up your feelings. If you're feeling overwhelmed, reach out and talk to others. This will help you work out your problems in a constructive way." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>"+n+
                    "Get enough sleep. Although the connection between sleep and acne is not entirely clear, most doctors agree that insufficient sleep puts you at greater risk for psychological stress. This will make your acne worse and is bad for your skin overall. Commit to getting 8 hours of sleep a night to give your skin a healthy boost." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>"+n+
                    "Exercise regularly. Besides reducing stress, exercise helps your acne by stimulating circulation to your skin. This brings essential nutrients to your skin and pulls toxins away, helping in the fight against acne. Doctors usually recommend 30-60 minutes of physical activity daily to keep yourself in healthy shape.\n" +
                    "Remember to wash your face after exercising to get sweat and dirt out of your pores." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>"+n+
                    "Stop using heavy cosmetics. These will clog your pores and make acne symptoms worse." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",

            "<h1><b>2.Lips Care</b></h1>" +
                    "<h2>Treating Your Lips</h2>"+n+
                    "<p>" +
                    "<b>Step 1</b>"+n+
                    "Exfoliate with a lip scrub. Exfoliating your lips will help to remove dead layers of skin and help generate regrowth of new skin cells.\n" +
                    "To exfoliate your lips, use an abrasive lip scrub product (for example, a sugar scrub) and gently rub it on your lips. Rub the mixture into your lips, removing any flakey or dead skin. Rinse off the remaining mixture for smoother lips.\n" +
                    "You can also try applying petroleum jelly to your lips and exfoliating by massaging them with a damp cloth. Apply the cloth in a gentle, circular motion to remove dead skin." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>"+n+
                    "Apply lip balm, almond oil, coconut oil, or olive oil. Applying oils to your lips will help to hydrate and maintain moisture." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>"+n+
                    "Hydrate your space with a humidifier. Dry air can dry out lips. If you can, use a humidifier in spaces where you spend a lot of time (like a bedroom) to infuse more moisture into the air. This is especially helpful during winter when the air can be more dry." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>"+n+
                    "Heal eczema by observing your beauty routine. The American Academy of Dermatologists suggest that the most common reason for lip eczema is an allergic reaction. This could be from your shampoo, lipstick, face wash, or even toothpaste.\n" +
                    "To heal eczema, try removing one product from your routine for about a week. If your lips start to clear up from a removal of a product, you can best guess that was the cause of the irritation." +
                    "" +n+n+
                    "" +n+n+
                    "</p>"+
                    "<h2>Practicing Healthy Habits for Your Lips</h2>"+n+
                    "<p>" +
                    "<b>Step 1</b>"+n+
                    "\n" +
                    "Quit smoking or chewing tobacco. Smoking can cause darkened lips and wrinkles on or around the lips. Both chewing tobacco and smoking can cause oral cancer, which can cause unpleasant lip lesions. Quitting these habits is the first step to healthier lips." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>"+n+
                    "Protect your lips against the sun by using sunscreen. Sunburn can cause cancer, blisters, cracking, and peeling. Use lip balm that contains sunscreen (at least 15 spf), or a sunscreen on your lips. Use this every day to help protect your lips against the sun." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>"+n+
                    "Stay hydrated. Drinking plenty of water not only will help your body stay healthy, but also keep your lips moist. This will stop dryness and cracking and make your lips appear fuller and healthier. While there is no standard of how much water or fluid you should drink per day, the Mayo Clinic suggests around nine 8-oz gasses (about 2 liters) of water a day for women, and 13 glasses (3 liters) per day for men." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>"+n+
                    "\n" +
                    "Stop licking your lips. This habit can cause your lips to dry out and crack.\n" +
                    "You can break this habit by wearing a bad-tasting lip balm.\n" +
                    "You can try chewing gum or sucking on a hard piece of candy to stop licking your lips.\n" +
                    "Every time you find yourself licking your lips, try drinking a glass of water. This will help you get into a good routine of staying hydrated as well as stop you from licking your lips." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 5</b>"+n+
                    "Get the proper vitamins and minerals. Cracked or dry lips can be a sign of vitamin or nutrient deficiency, such as vitamin B or D. Be sure to get the appropriate amount of healthy vitamins by maintaining a healthy diet or supplementing your diet with a daily multivitamin.[9]\n" +
                    "Foods high in vitamin D include fatty fish, like tuna, mackerel, and salmon.\n" +
                    "Foods high in vitamin B include yogurt, dairy, and dark, leafy green vegetables like spinach and kale." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 6</b>"+n+
                    "Keep your teeth healthy. Dentists have found that unhealthy teeth can lead to or indicate unhealthy lips. Be sure to visit your dentist every six months for a routine checkup and cleaning. Oral health goes beyond healthy teeth — it also includes your lips!" +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 7</b>"+n+
                    "Wear a mouthguard when playing sports. This will help prevent you from injuring your teeth. It may also stop you from involuntarily biting your lips if you fall or take a head injury." +
                    "" +n+n+
                    "</p>"+
                    "<h2>Preventing Oral Diseases</h2>"+n+
                    "<p>" +
                    "<b>Step 1</b>"+n+
                    "Prevent eczematous cheilitis or lip dermatitis. This disease is associated with dryness, cracking, or scaling of the lips. This may also affect the skin around the lips. This may be caused by allergies or by excessive licking of the lips.\n" +
                    "To prevent or eczematous cheilitis or lip dermatitis, your doctor may prescribe a topical ointment. Your doctor may also suggest an allergy test to seek out potential irritants." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 2</b>"+n+
                    "Identify cold or canker sores. Cold sores generally appear on the outside of the lips in a cluster of blisters. Canker sores are gray and white surrounded by a red inflamed area, generally located inside the mouth on the inside of lips, cheeks, tongue, or throat.\n" +
                    "These may be caused by a simple viral infection. Unfortunately, there is no known cure for sores although there are pain relieving options in topical ointments and treatments that may shorten the duration of a cold sore.\n" +
                    "You may treat these sores with a cool compress. You can also take an anti-inflammatory to help the swelling.\n" +
                    "You can prevent cold sores by avoiding the saliva (drinking after, eating after, or kissing) of a person who has a cold sore. If the sore is caused by a viral infection, it can be transmitted." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 3</b>"+n+
                    "Prevent leukoplakia. This disease is characterized by white patches on your lips, tongue, cheeks, or mouth. It is most commonly associated with tobacco (smoking or chewing). The best way to prevent this disorder is to stop smoking or chewing tobacco products.\n" +
                    "Leukoplakia is usually benign, but can sometimes show early signs of cancer." +
                    "" +n+n+
                    "</p>"+
                    "<p>" +
                    "<b>Step 4</b>"+n+
                    "Identify the symptoms of herpangina. This viral disease is characterized by blisters, ulcers, or sores in the mouth.It is a common childhood infection that can treated with plenty of fluids, rest, and over-the-counter pain relievers.\n" +
                    "Herpangina is typically short-lived and resolves on its own.\n" +
                    "Herpangina is similar to hand-foot-and-mouth disease (HFMD). Both are caused by a virus in the same family. HFMD causes the same mouth ulcers as herpangina in addition to spots on the hands and feet.\n" +
                    "As this is a viral infection, prevent this disease by frequently washing your hands or your child’s hands." +
                    "" +n+n+
                    "" +n+n+
                    "</p>"+
                    "",
            "<h1><b>3.Home Made Facepacks</b></h1>" +n+
                    "Facepacks Shown Below:" +n+
                    n+"1.Natural Face Mask" +
                    n+"2.Turmeric Face Mask" +
                    n+"3.Gram Flour Face Mask" +
                    n+"4.Sandalwood Powder And Rose Water Face Pack" +
                    n+"" +
                    "<h2>1.Natural Face Mask</h2>" +n+
                    "<h4>Egg Face Mask</h4>"+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Make an egg white face mask. Egg whites can tighten pores, giving you a temporary face lift, as lemon has vitamin C that can remove blackheads and other blemishes.\n" +
                    "Beat one egg white with a fork until it's frothy.\n" +
                    "Add a few drops of lemon juice, and apply on the face until it is dry. You can tell if it's dry if you have difficulty smiling.\n" +
                    "Finally, rinse off the mask." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Fruit face masks</h4>"+n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Make a mask with tomatoes. Tomatoes contain lycopene, slowing down the process of aging skin.\n" +
                    "Put a spoonful of granulated sugar on a plate.\n" +
                    "Coat one side of a 1⁄4 inch (0.6 cm) tomato slice in sugar.\n" +
                    "Rub it on your face and leave it on for approx. 10 min. And then rinse off. Feel free to eat the tomato." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Make a strawberry face mask. Strawberries contain alpha-hydroxy acid, which sloughs off dead skin cells, and salicylic acid that gets rid of excess oil that cause breakouts.\n" +
                    "Cut one large strawberry in half.\n" +
                    "Rub on the face.\n" +
                    "Leave for 5 minutes.\n" +
                    "Rinse off." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Make a grapefruit mask. The acids in grapefruit boost cell renewal, leaving you with fresh skin, and the vitamin C can increase collagen, making your face appear smoother.\n" +
                    "Mix the juice of 1 grapefruit with enough sugar to make a paste.\n" +
                    "Apply it on a damp face in the shower.\n" +
                    "Keep it on for only 1 minute.\n" +
                    "Rinse off completely." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Make an avocado and witch hazel face mask. Avocado has vitamin E which is perfect for dry skin, and witch hazel gets rid of excess oil as well as impurities.\n" +
                    "Mash the flesh of an avocado.\n" +
                    "Mix in a few drops of witch hazel.\n" +
                    "leave on the face for 5 minutes.\n" +
                    "Rinse off." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Make a peach and oatmeal face mask. As with strawberries, peaches contain alpha-hydroxy acid, and the oatmeal softens and soothes dry skin.\n" +
                    "Mash a ripe peach with a tablespoon each of oatmeal and honey.\n" +
                    "Apply for 10 minutes.\n" +
                    "Rinse off." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Make a banana face mask. Bananas have natural fruit acids that erase dry skin.\n" +
                    "Mash a ripe banana with 2 tablespoons of yogurt.\n" +
                    "Apply for 15 minutes.\n" +
                    "Rinse off." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Vegetable face masks</h4>"+n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Make a canned pumpkin and papaya face mask. Pumpkin is loaded with antioxidants, while papaya contains an enzyme that removes oil and dead skin.\n" +
                    "Mix a cup of canned (mashed) pumpkin with 2/3 cups mashed papaya.\n" +
                    "Apply on a clean dry face.\n" +
                    "Leave on for about 10 minutes.\n" +
                    "Rinse off." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Make a cucumber face mask. Cucumber has cooling properties that reduce redness, puffiness and inflammation; this is why putting cucumbers over your eyes is recommended for baggy eyes.\n" +
                    "In a blender, blend half a cucumber with a tablespoon of yogurt.\n" +
                    "Apply for 20 minutes.\n" +
                    "Rinse off." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Sweetener face masks</h4>"+n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Make a brown sugar and milk face mask. Brown sugar is a natural exfoliant that scrubs dead skin, and milk is a cleanser. Mix 1 cup of brown sugar with 1 tablespoon of milk. Then rub on the face for 60 seconds, and keep it on for 15 minutes. Rinse." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Make a yogurt and honey face mask. Honey softens and moisturizes dry skin, and yogurt has lactic acid that rejuvenates the complexion.\n" +
                    "Add a teaspoon of yoghurt to 2 tablespoons of honey, put it in the microwave for 15 seconds to melt the honey a little bit (optional).\n" +
                    "Apply for 10-15 minutes.\n" +
                    "Rinse off." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Make a honey and olive oil face mask. This helps acne and target spots and also brightens your complexion.[citation needed]\n" +
                    "Mix 1 teaspoon of honey and a teaspoon of oil. Warm it in the microwave for 10 seconds.\n" +
                    "Apply this paste on your face and leave it for a good 10 minutes.\n" +
                    "Rinse off." +
                    "" +n+n+n+n+
                    "</p>" +
                    "" +





                    "<h2>2.Turmeric Face Mask</h2>" +n+
                    "<p>" +
                    "Ingredients:" +
                    n+"1 tbsp honey\n" +
                    n+"1 cup chickpea powder\n" +
                    n+"1/4 tsp turmeric powder\n" +
                    n+"2/3 cup of milk\n" +
                    n+"More milk or water if needed (if these are not available, use yogurt or curd)." +n+
                    "<b>Step 1</b>" +n+
                    "Fill a bowl with a little bit more than a cup of chickpea powder." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Pour in 1 tbsp. of honey." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Put in 1/4 of a tsp. of turmeric powder." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Add in 2/3 of a cup of whole milk." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Mix well. Make sure you get all of the powder stuck at the bottom out and mixed in. It is best to use a somewhat deep bowl so it does not spill.If this is too thick, put in more milk or put some water in." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Use the bathroom or any other things you have to do. Then set a timer for 15 min." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Cleanse your face with a cleanser which is less foam." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Apply a medium thick layer of the pack onto your face and neck. Make sure to get your nostrils and under your eyes. Use the rest elsewhere on your body." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 9</b>" +n+
                    "Ask someone to start the timer for you. You can listen to some music while you wait!" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 10</b>" +n+
                    "Jump into the shower and wash it off once dry. Rinse your face and wet the pack. This will cause it to soften. Scrub it with your hands until it's off and finish your shower." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 11</b>" +n+
                    "\n" +
                    "Put on some moisturizer and admire your skin!" +
                    "" +n+n+n+n+
                    "</p>" +
                    "" +




                    "<h2>3.Gram Flour Face Mask</h2>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Add 2 tablespoons of gram flour into a clean saucer." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Add sufficient amounts of rose water to form a thick smooth paste." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Understand that if rose water is unavailable, one can substitute the rose water with tap or bottled water." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Notice that the mask is now ready to be applied to the face and neck areas." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Wash your face with lukewarm water. Do not use soap or face wash." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Wipe your skin with a clean towel until face is dry." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Now apply the face mask evenly onto your skin. The application should not be too thick." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Allow it to dry on your face for 5 minutes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 9</b>" +n+
                    "Wash off all of the dried flakes by using lukewarm water." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 10</b>" +n+
                    "Make sure that you do not use soap or face wash when washing away the gram flour mask." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 11</b>" +n+
                    "Touch your skin. It should feel softer and have a more radiant looking." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 12</b>" +n+
                    "Remember that this should be done at least once or twice a week for healthier looking skin." +
                    "" +n+n+n+n+
                    "</p>" +
                    "" +




                    "<h2>4.Sandalwood Powder And Rose Water Face Pack</h2>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Take about 2 tablespoons of sandalwood powder in a bowl." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Add rose water to make a thin paste." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Mix thoroughly to get rid of any lumps. Your face pack is ready now." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Clean your face with water." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Apply this paste evenly on the face avoiding the area around the eyes.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Leave it on for 15-20 minutes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Rinse with cool water." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Gently pat your face dry with a clean towel.\n" +
                    "" +n+n+n+n+
                    "</p>" +
                    "",
            "<h1><b>4.Glowing Face</b></h1>" +n+
                    "<h4>Cleansing Your Skin</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Choose a gentle cleanser. The best cleanser for sensitive skin is a non-abrasive product that does not contain any alcohol. Abrasive cleansers or cleansers containing alcohol can irritate and dry out your skin. Always read the ingredients before purchasing or using a facial cleanser." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Use your fingertips to apply the cleanser. You won't need too much cleanser. Simply pour out enough to cover your whole face into your hand, then apply it to your face. Only apply the cleanser with your fingers, as a washcloth or sponge may irritate sensitive skin.\n" +
                    "Splash some clean, lukewarm water on your face to wet your skin.\n" +
                    "Apply the cleanser with your fingertips. Make sure your hands are clean before you begin applying the product.\n" +
                    "Do not scrub your skin. Scrubbing can irritate sensitive skin, and won't necessarily make the cleanser any more effective." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Rinse and dry your face. Using clean, lukewarm water, wash away all the cleanser from your face. Then use a clean, soft towel to gently pat your face dry. Be careful not to use a scratchy or coarse towel, as this can irritate sensitive skin, and make sure you dab your face dry to avoid damaging your complexion." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Unclogging Your Pores With Steam</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Bring two quarts of water to a boil. Hot steam is often used to open up pores and improve skin complexion. If you don't have a specialized facial steamer, you can simply boil water in your kitchen and carefully let the steam linger around your face.\n" +
                    "Use a tea pot, a stove-top pot, or an electric kettle to heat the water.\n" +
                    "Bring the water to a gentle boil. Remove promptly once the water starts to boil so it doesn't get too hot." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Pour the boiling water into a heat-safe bowl or pot. Once the water is boiling, you'll need to transfer it to a heat-safe container. Choose a bowl or pot with a wide opening so that you'll be able to hold your face above it more effectively.[5]\n" +
                    "The water should be warm, not hot.\n" +
                    "If the water is too hot, add a little cold water until it's at a comfortably warm temperature." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "\n" +
                    "Hold your face over the bowl and direct the steam to your face. You'll want to hold your face approximately six to eight inches away from the bowl of water. Place a towel over your head to trap the steam around your face, and keep your face in the steam for 4 to 10 minutes.\n" +
                    "Excessively steaming your face can end up drying out your skin or producing an oily complexion.\n" +
                    "Limit steam sessions to once a week, and do not exceed 10 minutes of steam time." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Rinse the sweat and dirt away with cool water. After 4 to 10 minutes of steam, your pores will be open and you will most likely be sweating. All that heat, coupled with your opened pores, could leave a lot of dirt and sweat trapped on your face. The best way to finish up any steam session is by rinsing your face with clean, cool water to ensure that your skin stays clean." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Exfoliating Your Skin</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash your face with a hydroxy acid cleanser. Hydroxy acid cleansers are made with either alpha-hydroxy or beta-hydroxy acids. The mild acid in hydroxy acid cleansers can help remove dead skin cells and balance your skin tone.\n" +
                    "Apply a small amount of hydroxy acid cleanser to your face.\n" +
                    "Rinse the cleanser away with clean, lukewarm water." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply a retinol cream. Retinols are derived from vitamin A. These creams can improve acne and may actually reduce damage from the sun's UV rays. In order go acquire a true retinol cream, you'll need a doctor's prescription. Talk to your dermatologist about how retinol may help your skin.\n" +
                    "Some common prescription-strength retinol creams include tretinoin and tazarotene. They typically come in strengths of 0.01 to 0.1% and should be applied once every day." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Try a mechanical exfoliation. Mechanical exfoliation peels away the outermost layer of your skin. This leaves you with a smoother layer of skin that is more effective at absorbing any skin-care products you subsequently apply. Some mechanical exfoliation can be performed at home, while other methods will need to be performed by a specialist.[12]\n" +
                    "Microdermabrasion, microneedling, dermablading, and cleaning brushes are all common ways of mechanically exfoliating your skin." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Use a chemical exfoliator. Chemical exfoliators can be administered by a dermatologist or aesthetician. They typically use acids to peel away your outer layers of skin and promote new skin cell growth. Chemical peels can help reduce acne and improve your skin's tone and texture.\n" +
                    "Common chemical exfoliants include salicylic acid, glycolic acid, a blend of acids, enzymes, and/or retinols." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Moisturizing Your Face</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Choose the right moisturizer. There are many different types of facial moisturizers, and the options may seem overwhelming. Some skin moisturizers can actually dry out your skin, making your complexion even worse. Make sure you choose a moisturizer that won't dry your skin out or irritate your face.\n" +
                    "Opt for an oil-based moisturizer. Water-based moisturizers won't retain moisture against your skin as effectively as oil.\n" +
                    "Avoid moisturizers made with petroleum or petroleum-based ingredients. These can severely dry out or irritate your skin." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply moisturizer to your face. Add moisturizer immediately after cleansing or exfoliating your skin. Using moisturizer while your face is still damp can help lock more moisture into your skin. You can also use moisturizer any time throughout the day when your skin feels dry.\n" +
                    "Dry skin can further damage your complexion. Remember that it's better to use too much moisturizer than not enough." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Consider making and using a hydrating mask. If regular moisturizing lotion isn't sufficient, you can make your own hydrating mask at home. Many common, moisture-rich kitchen ingredients can be combined and applied to your face to lock in moisture and improve your complexion.\n" +
                    "Common ingredients include honey, avocado, yogurt, olive oil, bananas, and aloe.\n" +
                    "Blend your desired ingredients into a cream or paste-like consistency.\n" +
                    "Apply the mask to your face and leave it on for 10 to 30 minutes before washing it off." +
                    "" +n+n+n+n+
                    "</p>" +
                    "",
            "<h1><b>5.Dark Spots Cure</b></h1>" +n+
                    "<h4>Trying Home Remedies</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Rub your skin with citrus. Citrus fruits contain abundant amounts of Vitamin C, also known as ascorbic acid, along with citric acid. These acids help slough off the top layer of skin without causing damage. Here are some ways to use them.\n" +
                    "Squeeze some juice and dab it on your skin. Women have used straight lemon juice to lighten their skin for centuries, but you can use an orange, grapefruit or lime if you prefer. Slice the fruit in half and squeeze the juice into a cup or bowl. Using a cotton ball, dab it onto your dark spots. Leave it on for 20 minutes, then rinse off. Repeat once or twice a day.\n" +
                    "Make a lemon and honey face mask. Combine the juice of half a lemon with 2 teaspoons of honey. Mix well, and apply to your face. Leave it on for 30 minutes, then rinse well.\n" +
                    "Make a citrus and powdered milk scrub. Combine 1 teaspoon each of water, powdered milk and the juice of your favorite citrus fruit. Mix into a soft paste and massage into your skin. Rinse well." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Try Vitamin E. A powerful antioxidant, Vitamin E helps repair damaged cells and strengthen new ones. You can use Vitamin E as a topical treatment alone, or boost its benefits by also eating foods high in Vitamin E.\n" +
                    "Topical application: Massage pure Vitamin E oil directly onto your dark spots. With daily application, your spots will fade.\n" +
                    "Dietary sources: Add these foods to your diet to get even more Vitamin E power: nuts (almonds, peanuts, pine nuts), sunflower seeds, wheat germ oil, and dried apricots." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Slice up a papaya. Papaya fruit contains the enzyme papain. Papain helps exfoliate the skin, making way for new skin cells to emerge. Papaya also contains Vitamin C and Vitamin E, so it's a dark spot fading superstar. Papain is most concentrated while the papaya is still green, but you can use riper fruit as well. Peel and remove the seeds from a papaya, and try one of the following treatments:\n" +
                    "Slice a piece off of the papaya, and lay or hold it on the dark spots that you want to get rid of. Hold it there for 20-30 minutes. Repeat twice a day for best results.\n" +
                    "Make a papaya facial mask. Cut the papaya into chunks, then use a blender or food processor to blend the fruit into a smooth paste. Apply the mask to your face and neck. Leave it on for about 30 minutes, then rinse well." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Reach for aloe vera. The aloe vera plant has many health benefits. It's an excellent moisturizer, and is effective for healing sunburns. It can also help fade dark spots. If you have an aloe plant at home, break off a small piece, squeeze the pulp into your hand and apply it directly to your dark spots. You can also find aloe gel in stores. Pure aloe vera will work best, so make sure you're purchasing a 100% aloe vera product." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Try a red onion. Onions have acidic properties that act to lighten dark spots on skin. It's worth a try if you don't have a lemon on hand! Peel a red onion, cut it into chunks, and process it in either a juicer or a blender. Use a cotton ball to dab some of the onion on your dark spots, and let it sit for 15 minutes before rinsing it off." +
                    "" +n+n+n+n+
                    "</p>" +
                    "<h4>Preventing More Dark Spots from Forming</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Limit your sun exposure. Exposure to UV rays is one of the most common causes of dark spots. No matter what kind of dark spots you have, staying out in the sun too long can make the problem worse. As far as prevention goes, staying away from these harmful rays is the best thing you can do to protect yourself. Take the following measures to keep your skin safe from too much exposure to UV rays:\n" +
                    "Wear sunscreen. Even in the winter, wear sunscreen on your face with SPF 15 or higher.\n" +
                    "In strong, direct sun, wear a hat and sunglasses. Cover the rest of your face with strong sunscreen.\n" +
                    "Don't use tanning beds. The direct exposure to UV rays is harmful to your skin (as well as internal organs).\n" +
                    "Don't sunbathe. When your tan fads, dark spots will be left behind." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Take stock of your medications. If you have melasma that's caused by medications you're on, you might be able to get rid of dark spots by switching to a different medication. Talk with your doctor to discuss your concerns and see if there's something else you could take that doesn't have this side effect." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Watch out for professional skin treatments. Hyperpigmentation can result from a skin treatment that wasn't properly administered. Plastic surgery or deep chemical peels can end up leaving dark spots behind. Before you get any kind of skin treatment, do thorough research to make sure the technician or physician has plenty of experience in the area and a good track record." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Keep your hands off your face. Whenever you find a pimple on your face, do not try to press, rub or touch it. The more you touch a pimple, the more are the chances of developing a dark spot. Remember, dark spots arise as pimples vanish!" +
                    "" +n+n+n+n+
                    "</p>" +
                    "",
            "<h1><b>6.Dark Circle Cure</b></h1>" +n+
                    "<h4>Using Natural Remedies</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Apply a cold compress. Coldness will help reduce the blood vessels under your eyes that may be contributing to puffiness and dark circles. Soak a washcloth in ice cold water or use the back of a frozen spoon. Lie down and hold the cold item to your closed eyes for about 15 minutes. Try this 3-4 times per day to reduce the dark circles." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Try cucumber slices. Cucumbers have a number of healing properties, including a restorative and healing effect on skin.[8] To use cucumbers on your eyes, refrigerate a large cucumber until it is very cold, and then cut it into 1⁄2 inch (1.3 cm) slices. Lie down with your head back and place one slice of cucumber over each of your eyes. Let the cucumber sit there for 10-15 minutes, and then remove.\n" +
                    "Alternately, juice a cucumber. Put the juice on a cotton ball and press that onto your eyes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Apply mint leaves. Crush some mint leaves into a paste. Add juice from half of a lemon to the paste. Apply this mixture to the area under your eyes. Leave for 15 minutes, then rinse off with cold water. Repeat this application twice daily." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Use green tea bags. Green tea is rich in antioxidants and can make up for antioxidant deficiencies in the body that contribute to dark circles. Pour hot water over two tea bags and let them steep for 5 minutes. Remove the tea bags and place them in the freezer. Remove when the tea bags are very cold. Lie down and press the tea bags onto your eyes. Hold them there for about 15 minutes. Rinse your eyes with cold water and pat dry." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Use a neti pot. A neti pot is a device that resembles a small teapot. It is used to help flush salt water through your sinuses. Add warm distilled water to the neti pot and add kosher salt or sea salt (avoid iodized salt). Use ½ to 1 teaspoon of salt per 16 ounces of water.  Tilt your head to the side and pour the water into one nostril. Let the water drain out the other nostril.\n" +
                    "Follow the usage instructions on the neti pot’s packaging." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Use other natural remedies. There are a number of remedies and recipes that use natural ingredients. Search online for natural remedies to treat dark circles. Some of these ingredients include:\n" +
                    n+"Chamomile\n" +
                    n+"Almond oil\n" +
                    n+"Arnica\n" +
                    n+"Rose water\n" +
                    n+"Avocado" +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "<h4>Making Lifestyle Changes</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Get enough sleep. There are a number of potential causes of dark under-eye circles, including a lack of sleep. Be sure to get 7-8 hours of sleep every night to diminish the appearance of dark circles and to improve your overall health.\n" +
                    "Try sleeping in a different position. If you sleep on your side or stomach, gravity might be working to collect fluid under your eyes, which contributes to dark circles. Position yourself on your back for sleeping. If you naturally roll over in your sleep, try bolstering your body into position with pillows.\n" +
                    "Use an extra pillow or two to elevate your head so that fluid doesn’t collect under your eyes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Monitor your allergies. Allergies to seasonal triggers (pollen, for example), as well as to dust, pet dander and other things can make your eyes look puffy and the area under your eyes can look darkened. Take allergy medication to control your allergy symptoms. Alternately, limit your exposure to the allergens that are bothering you.\n" +
                    "Dark circles under the eyes are a common symptom that indicates a food allergy or sensitivity. Common food allergens are wheat, soy, egg whites, peanuts, sugar and others. Try eliminating foods that you might be sensitive to." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Eat healthy, vitamin-rich foods. Dark circles can be caused in part by vitamin deficiencies, such as a lack of calcium, iron, vitamins A, E and B12, and antioxidants. Consume more leafy green vegetables and eat foods rich in these vitamins. Reduce your intake of salt." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Stay away from alcohol. Alcohol causes the skin to become dry and thin, so cutting down on your alcohol consumption may improve the appearance of under eye circles and puffiness." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Avoid smoking. Smoking weakens collagen, causing skin to prematurely wrinkle and thin, which can make dark circles look more dramatic. Refrain from smoking and avoid being in areas where there is smoke." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Wear sunscreen. Wearing sunscreen on your face can help prevent dark rings from appearing in the first place, and can prevent existing circles from getting any darker. Apply sunscreen about 15 minutes before going outside. Reapply sunscreen every two hours that you’re outside.\n" +
                    "Wear sunglasses also when you’re out in the sun to prevent you from squinting and to protect your eyes." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "<h4>Using Skin Creams</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Apply retinol to your skin. Retinol increases collagen production, which will help strengthen the skin under your eyes, which can help reduce the appearance of dark circles. Retinol creams are available at drug stores for around $10, although high-end creams can cost upwards of $50 to $60 or more. Use this cream on a daily basis, applying either in the morning or evening. Dab the cream under and above your eyes and smooth it in.[21]\n" +
                    "Retinol is not a quick fix. Experts say that it may take up to 12 weeks of application to see a noticeable difference in your skin." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Ask your dermatologist about prescription creams. Ask about a prescription cream with vitamin A and retinoic acid, which can temporarily increase blood flow to the area, and can thicken the skin underneath the eye to diminish the look of shadows." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Use a skin-lightening cream. Use a cream with skin-lightening properties like soy or citrus. With regular use, these types of lotions can cause dark circles to lighten, and can also treat sunspots.\n" +
                    "Stay away from lotions that contain the skin-lightening chemical hydroquinone, as it is too harsh for the sensitive skin around the eye.\n" +
                    "These creams will also take a while to show effects, often up to 6 weeks." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "",
            "<h1><b>7.Sparkling Eyes</h1></b>" +n+
                    "<h4>Using Eye Drops</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Use regular eye drops like Visine or Clear Eyes. These eye drops are used to reduce redness in your eyes and give them a bit of moisture to counteract irritants or otherwise dryness in the eyes. Visine, Clear Eyes, and other brands can be purchased at grocery and drug stores, as well as larger stores like Target, Walmart, and so on. Put 1-2 drops in the affected eye. Consult the instructions on the bottle for additional information.\n" +
                    "Don't use eyedrops like Visine or Clear Eyes too often. While they give good immediate results, when used regularly, they actually prevent your eyes from creating their own natural lubrication, and your eyes may become chronically dry, red, and dependent on the drops. A safer option is saline drops or gentle eyedrops like Systane that mimic natural tears." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Try thicker viscosity eye drops. A Japanese brand of eye drops called Rohto is a product that is thicker than natural tears. They have cooling properties that relieve burning eyes and they reduce redness as well. These are available at grocery and drug stores. If you have not used any eye drops before, these might not be the best ones to start with, as they can feel a little harsh to the eye." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Try blue eye drops. A company from Switzerland, Innoxa, makes eye drops that are actually colored blue. In addition to relieving burning and redness symptoms, Innoxa Blue Drops also coat your eyes with a light film of blue, which counteracts the yellowish tinge in your eyeballs to make them appear whiter." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "<h4>Changing your Health Habits</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Eat a rainbow of fruits and vegetables. Orange and yellow fruits and vegetables, such as carrots, pumpkins, lemons and oranges, contain vitamins and antioxidants that will help keep your eyes white. Eating green, leafy foods like spinach and kale also have a positive effect on your eye health. Nuts like almonds, walnuts and peanuts also contain minerals that promote eye health.\n" +
                    "These fruits and veggies will also help to detoxify your liver. A healthy liver will help keep the whites of your eyes clear and bright. If your liver is full of toxins, then it may not be able to process foods and vitamins as efficiently as it should. Detoxify your liver by drinking a glass of beetroot juice on an empty stomach, or eating carrots and spinach." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Reduce refined sugars and carbohydrates in your diet. Reducing the amount of foods that contain refined carbohydrates and sugars, as well as wheat, can help your body process foods better and detoxify your liver. Decrease the amount of unhealthy foods you eat, particularly at night, which can interfere with a good sleep pattern." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Take supplements. Your eyes depend on good levels of Vitamin A and C to maintain their health. In addition to eating foods rich in these vitamins, take a supplemental vitamin every day. Also boost your level of omega 3 acids by taking 4 capsules every day of omega 3 or fish oil supplements." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Get 7 to 8 hours of sleep every night. Getting enough sleep every night will ensure that your body is rested and consequently that your eyes are rested and restored to their natural white color. Get at least 7 to 8 hours of sleep every night. If you are having trouble falling asleep, try soothing music or 10 minutes of meditation before going to bed to ensure that your body knows that it’s time to sleep." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Drink plenty of water. Bright white eyes rely on adequate hydration, and keeping your body hydrated will help replenish your body’s fluids, thus reducing puffiness and redness in your eyes. Drink 8 to 10 glasses of plain water every day, or approximately 64 ounces." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Cut down on alcohol and caffeine. Both of these will dehydrate your body and add to puffiness and redness to your eyes. They also can interrupt good sleep patterns, which may interfere with you getting 7-8 hours of sleep every night." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Avoid irritants like smoke, dust and pollen. Smoking irritates the eyes and can cause redness. It can also dry out the eyes. Eliminating smoking from your daily habits can help your eyes restore their natural color and hydration. Dust that can be found both outside and inside can also irritate your eyes and make them prone to redness. Pollen and other allergens might also contribute to eye irritation. Use an air purifier indoors to reduce these irritants if they are hard to avoid." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Reduce eyestrain. Working on a computer all day long can take a toll on your eyes, but it might not be an option to reduce the amount of time you spend on the computer. If you must work on a computer for several hours every day, then you should address ways to help reduce eyestrain. These can include installing proper lighting, changing your computer’s settings so that your monitor is the same brightness as the rest of the room, blink more often, exercise your eyes, and so on." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 9</b>" +n+
                    "Wear sunglasses when you are outside. UVA and UVB rays can damage your eyes over time, and exposure to sunlight contributes to yellowing your eyes. Wear sunglasses that protect your eyes from UVA and UVB rays. Most sunglasses available today will have this feature, but be sure to check the label. Try to wear sunglasses whenever there is even a little glare outside. There doesn’t need to be blue skies and sun for you to need sunglasses. On cloudy days, there may be quite a lot of glare that can strain and damage your eyes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 10</b>" +n+
                    "Visit your doctor. You may have a medical condition called jaundice that contributes to yellowish eyes. Jaundice is a condition when hemoglobin in your blood is broken down into bilirubin and does not clear through your body properly. If the bilirubin builds up in the skin, it causes the skin and eyes to appear yellow. Jaundice can indicate a medical issue most commonly having to do with the liver, gall bladder, or pancreas. Talk with your doctor to rule out jaundice and any underlying diseases or conditions that may be contributing to yellowish eyes." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "<h4>Using Natural Remedies</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Try Ayurvedic remedies. Ayurvedic medicine originated in India about 3,000 years ago and uses natural remedies and practices to prevent and treat health conditions. Triphala is an herbal mixture used in Ayurvedic medicine that can treat a number of conditions, including improving eye health and eye whiteness. It accomplishes this in part by detoxifying the body. Triphala can be purchased at Indian food import stores as a powder or in tablet form.\n" +
                    "Use triphala as an eye wash. Dissolve one tablespoon of the powder in 8 ounces of water overnight. Strain this mixture and then sprinkle it over your eyes or use as an eye wash.\n" +
                    "A word of caution: triphala is also used as a laxative to correct constipation, so proceed carefully with using it.\n" +
                    "One of the main ingredients in triphala is Indian gooseberry, the juice of which can be dropped directly into your eyes at night to improve their whiteness." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Rub carrot juice on your eyelids. Eating carrots will improve your eye health, and so will topical application of the juice. Wash and dry several carrots, and chop off their ends. Process several carrots through a juicer to get healthy carrot juice that can then be applied on your eyelids. Leave the juice on your eyelids overnight. Be careful not to put the juice directly into your eyes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Use a cold compress on your eyes. Putting your skin in contact with something cold will help reduce puffiness, but it can also help whiten your eyes as well. Soak a washcloth in ice water, wring it out, and lay the washcloth over your eyes for 5-10 minutes. The redness in your eyes should diminish after repeating this a few times over the course of a day." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "<h4>Using Makeup</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Brighten the area under your eyes. Dark circles under your eyes will make your eyes appear dull. Brighten up the area under and around your eyes by applying concealer. Dab several small dots of concealer across the bottom of your eye and gently tap across the dots to blend them with the rest of your skin." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Use blue tones of eye shadow and eyeliner. Adding navy or indigo blue colors around your eyes will be somewhat softer than the drama and harshness of black colors. Also, the blue tones will help to counteract yellowish colors that might show up in the whites of your eyes, which will make your eyes appear brighter and clearer." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Use eyeliner. These days white eyeliner could be easily found in market. Just a swipe or two of white eyeliner on your eyelid will not only make them brighter will also make them wider. You can also take little white eyeliner near corner of your lids and blend it, this will give an angel like look. Your face will look dewy and very fresh.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Use brown mascara on your bottom lashes. Making your eyes stand out can help them appear whiter. Using black mascara on both top and bottom lashes will make dramatic eyes, but they do not help your eyes look whiter. Instead, try brown mascara on your bottom lashes. This softer color will help draw the attention upwards to your top lashes, which will make your eyes appear wider, more alert and whiter." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Try a light-colored eyeliner. By using a light bone-colored or flesh-colored eyeliner, your eyes will attract and reflect light, which will help make it seem like your eyes are larger. Outline the inner corners of your eyes with the eyeliner to give the illusion of being brighter.\n" +
                    "Apply a shimmering white or light-colored eye shadow in the inner corners of your eyes to attain a similar effect.\n" +
                    "Try to refrain from using a white eyeliner pencil to outline your eye, as this can be hard to blend in properly and may look too \"staged\" or artificial." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Use an eyelash curler. An eyelash curler, which is readily available at drug stores and grocery stores for about $5 to $6, will clamp your eyelashes and bend them upwards in a curl. Curling your lashes upward will make your eyes appear to be bigger and more open. They can also draw attention to your eyes by making your eyelashes appear longer." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Use a bit of pink blush. Apply pink blush to the apples of your cheeks, your lips, and across the highest point of your eyebrows. This will lighten and brighten your entire face, which will help make your eyes appear brighter and whiter." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "",
            "<h1><b>8.Face Cleanser</h1></b>" +n+
                    "<h4>Washing Your Face Every Day</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wet your face with warm water. Pull your hair back and wet your skin with plenty of warm water. Using hot or cold water can be abrasive to your skin, while warm water is gentle and won’t cause irritation.\n" +
                    "You can splash water on your face using your hands, or moisten a towel and use that to wet your skin.\n" +
                    "Wetting your skin before applying cleanser will help the soap slide more easily across your skin, preventing you from having to use too much."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply your cleanser of choice. Use a dime-sized amount of cleanser that works with your skin type. Apply it to your face in a circular motion, making sure each spot gets covered with a tiny amount of cleanser. Keep massaging in a circular motion for thirty seconds to a minute.\n" +
                    "Avoid using hand or body soap as your facial cleanser. Facial skin is more sensitive than the skin elsewhere on the body, and harsher soaps can cause it to get dry and irritated.\n" +
                    "If you’re wearing makeup, you may also want to use a special makeup remover, especially around your eyes. Plain coconut oil is a great natural makeup remover."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Gently exfoliate your skin. Exfoliating is the process of gently scrubbing your skin to remove dirt and dead skin cells. Exfoliating every few days will keep your pores from getting clogged and help your facial skin look fresh and bright. Use a facial scrub or a washcloth to rub your skin in a circular motion, focusing on areas that tend to be dry or oily.\n" +
                    "Exfoliating too often or too vigorously can irritate your skin. Do it just a few times a week, and make sure you don’t scrub too hard. On the days when you don’t need to exfoliate, just skip this step when you wash your face.\n" +
                    "You can make your own facial scrub using a few household ingredients. Try mixing 1 teaspoon honey, 1 teaspoon granulated sugar and 1 teaspoon water or milk."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Rinse and pat it dry. Use warm water to rinse your face, making sure to wash away all traces of your cleanser and scrub. Use a towel to pat your face dry. Try not to rub your face when you dry it, since this can encourage wrinkles and irritate the skin."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Apply toner for a smooth appearance. Using toner is an optional step that’s nice to try if you want your skin to look smooth and reduce the appearance of pores. Apply toner using a cotton ball, focusing on areas where your pores appear large.\n" +
                    "Many store-bought toners contain alcohol, but this can dry out your skin. Look for an alcohol-free toner, especially if your skin tends to flake.\n" +
                    "Natural toners tend to work just as well as store-bought toners. Try a mixture of half lemon juice, half water for a great homemade option. Aloe, witch hazel and rose water also work well."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Finish with moisturizer. Choose a moisturizer formulated for facial skin and smooth a dime-sized amount over your face. Moisturizer helps to protect your skin from the elements, keeping it youthful and bright.\n" +
                    "If you wash your face just before bed, try a heavier moisturizer meant to help your skin renew overnight.\n" +
                    "If you’re heading outside, use a moisturizer that contains sunscreen with SPF 15 or higher to protect your face from the sun’s rays."+
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "<h4>Washing Acne-Prone Skin</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash your skin twice a day. Washing once in the morning and once at night is a good routine for those with acne-prone skin. Washing in the morning refreshes your face and cleanses away bacteria that may have grown in the night, while washing at night is important for removing sweat, dirt and makeup from your skin. Washing your face more than twice a day could dry out and irritate your skin.\n" +
                    "Many people with acne think that washing more often will result in better skin, but that’s not the case. Facial skin is fragile, and washing too much can cause it to tear and weaken.\n" +
                    "If you feel your skin needs to be refreshed between washes, it’s better to splash it with plain lukewarm water instead of using soap or chemicals."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Use a cleanser formulated for acne-prone skin. Regular commercial facial cleansers often contain ingredients that make acne worse. Chemicals, alcohols, and oils can irritate your skin or cause your pores to get clogged, which is the opposite of what you want if you’re dealing with acne. Choose a cleanser that is specifically designed to be used on acne-prone skin.\n" +
                    "Not all acne-prone skin is oily; many people with dry skin have acne. Make sure you choose a facial cleanser that works with your skin type and won’t dry it out too much.\n" +
                    "If your acne is severe, you may want to use a medicated cleanser with ingredients that will kill the bacteria that can clog pores and cause acne. Talk with your doctor about getting a prescription, or look for an over-the-counter cleanser with salicylic acid, sodium sulfacetamide, or benzoyl peroxide."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Do not scrub your face. Many people with acne make the mistake of scrubbing hard in an effort to unclog pores. This method creates tiny tears in the skin that can become inflamed and create worse acne problems. When you have acne, it’s important to handle your skin gently. Exfoliate very lightly, and never roughly scrub your skin.\n" +
                    "Instead of using a facial scrub, try using a soft washcloth to rub your skin in a circular motion.\n" +
                    "Never use a scrub brush on your acne-prone skin."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Avoid using hot water. Hot water can cause facial skin to become red and inflamed, so err on the side of using cooler water when you’re washing your face. You may also want to avoid facial steams during acne flare-ups, since the heat can make the problem worse."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Pat your face dry gently. With acne, it’s important not to abrade your skin by using a rough towel to dry it off. Purchase a soft facial towel and use it to pat your skin dry after washing. Be sure to wash your towels frequently so you aren’t applying bacteria to your face when you dry it off."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Finish with oil-free moisturizer. If you tend to have acne, your pores probably clog easily. Many have found it helpful to use an oil-free moisturizer to protect acne-prone skin. If you do choose to use a moisturizer with oil, you may want to test it on a small patch of skin and wait a few days to see what happens before applying it to you entire face.\n" +
                    "Aloe is soothing to irritated skin and makes a great light, oil-free moisturizer.\n" +
                    "If your skin is particularly oily, feel free to forego moisturizer completely, or just apply it to the spots where your skin gets dry."+
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "<h4>Washing Dry Skin</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash once a day. If your skin is quite dry, washing your face more than once a day will just dry it out even more. It’s important to wash your skin at night to remove makeup, dirt, and sweat from your skin before you go to bed. In the morning, just refresh your face with a splash of lukewarm water or a damp washcloth instead of going through your full cleansing routine. Always finish with moisturizer to keep your skin from flaking."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Use light soap or oil as your cleanser. Dry skin just gets drier when you wash it, so it’s important to choose your cleanser carefully. Look for a very light cleanser formulated for dry skin, or try using oil as your cleanser.\n" +
                    "To use oil, simply wet your face and apply your oil of choice (almond, olive, jojoba, coconut, etc.). Use a washcloth to rub your face in a circular motion, then rinse away the oil with warm water.\n" +
                    "If you want to use a store-bought cleanser, look for one that does not contain sodium laurel or laureth sulfate. Sulfates are harsh cleaning agents that will dry out your skin even more."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Exfoliate often to get rid of dead skin. If your skin is dry to the point of flaking, you might need to exfoliate more than once or twice a week. Try exfoliating every other day by rubbing a soft washcloth over the dry spots using a circular motion. The key is to exfoliate without drying out your skin further or causing it to get irritated.\n" +
                    "If your skin is extremely dry, you can exfoliate using oil. Dip a corner of a soft towel or cotton pad into coconut oil (or another rich oil of your choice). Rub the oil into your face using a circular motion. This will exfoliate your skin while nourishing it at the same time.\n" +
                    "Don’t use a loofah, a scrub brush or any other abrasive material on your skin. Dry skin is more prone to tearing and wrinkling than normal or oily skin, so it’s important to handle it gently."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Rinse with cool or warm water. Hot water will cause dry skin to get even drier, so use cool or lukewarm water for rinsing. Using too much water is another way to dry out your skin, so just use a splash or two. You can also control the amount of water you use by wiping your face with a moist towel instead of splashing it with water."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Pat your face dry with a soft towel. Use a soft, fluffy towel to wick the moisture from your skin without pulling it back and forth. Patting it dry will keep your skin from getting inflamed or flaking."+
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Finish with a rich moisturizer. Choose a moisturizer intended for dry facial skin to keep your skin looking fresh and hydrated. Natural or handmade moisturizers are often best for dry skin, since they don’t contain chemicals that can cause irritation and dryness.\n" +
                    "Look for a moisturizer that contains shea butter, coco butter, or another rich, emollient ingredient that will protect your skin from drying out.\n" +
                    "If your skin tends to flake a few hours after washing it, try applying a dab of coconut oil or aloe to refresh your skin."+
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "",
            "<h1><b>9.Lightening Tan</b></h1>"+n+
                    "<h4>Lightening Your Tan with Everyday Ingredients</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Dab on some dairy. The lactic acid in milk not only combats pigmentation problems, but stimulates collagen to improve your skin’s firmness and refines the appearance of wrinkles and lines. You can receive its benefits by dipping your hands directly into milk or milk mixtures, or by buying skincare products containing lactic acid.\n" +
                    "Full-fat Greek yogurt is another popular choice. Massage it into the tanned skin, let it sit for twenty minutes, and then wash it off with warm water. Repeat daily. Its fat content also moisturizes! \n" +
                    "Lactic acid peels are also available for more extreme, ongoing treatment (in case of irregular, unwanted pigmentation spots in skin), but skin generally takes time to adapt to and fully tolerate the process. Therefore, it's not best for our purposes here." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Mix lemon juice with aloe juice. Lemon juice will dry your skin out, but has lightening properties. Adding aloe juice for its moisturizing properties makes for a winning combination.\n" +
                    "Don’t sweat the ratios too much. Mix equal-ish parts aloe and lemon juice, rub it into your skin, and wash the area twenty to thirty minutes later.\n" +
                    "You should especially steer clear of the sun with any lemon juice-based mixture on your skin, as it can make your skin extremely sensitive to UV rays." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Combine buttermilk and tomato juice. Tomato is a natural bleaching agent, and we already know about dairy. Apply two parts buttermilk and one part tomato juice to the tan via cotton ball, and wash off after thirty minutes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Attack a fake tan with baby oil. With spray-on tans in particular, baby oil proves highly effective in helping you slough off that uppermost layer of color. Exfoliation is still the name of the game (and skin cell removal is the idea) so after leaving the baby oil on the area for thirty to forty minutes, take a bath and exfoliate appropriately." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Preventing Unwanted Additional Color</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Coat yourself in sunscreen. You can’t go overboard here if you’re trying to stay as pale as possible! 30 SPF is the baseline advised by the American Academy of Dermatology, though going higher doesn’t hurt. \n" +
                    "It’s easy to forget about the brief, incidental sun exposure we all incur just going about our daily lives. Remember to apply every day if you’re looking to avoid gaining color; you walk under the same sun when you get your mail as you do when you stroll along the beach." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Cover up, even on cloudy days. Long sleeves may not be too fun in the heat, but you’ll need to cover as much skin as you can while you’re outside. Clouds make very little difference in the sun’s effect on your skin, too, blocking a mere 20% of UV rays.\n" +
                    "And if you thought you were safe on the ski slopes, think again: snow actually reflects 80% of UV rays, increasing exposure. So if you were planning on skiing shirtless for some reason… maybe don’t." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Open an umbrella. Admittedly, you might feel a little silly at first, but it’s a surefire way to block out the sun during your walk down the block. Consider a parasol if you’re looking for something a little more chic.\n" +
                    "Don’t entrust it all to an umbrella at the beach, however. As you might’ve guessed after learning of snow’s powerful reflective potential, sand, too, reflects UV rays. Not as bad as snow—only 17% from sand—but still enough for the sun to make its mark." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Stay indoors. When it comes down to it, staying inside will keep you the palest. Full-on hermit life isn’t an option for everyone, though, and keep in mind it’s not a requirement to keeping your skin lighter if you can abide by the above steps.\n" +
                    "The body does requires Vitamin D, though, and nutritional guidelines for vitamin D (600 IU from ages 1-70) are generally set with the assumption that a person will be receiving some regular sunlight. [10] Fatty fish, beef liver, eggs, cheese, and mushrooms provide some vitamin D, and U.S. milk is often fortified with it." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Exfoliating Your Tan Away</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Stop now if you’re sunburned. You might be tempted to attack your sun damage even harder if you’re burned, but the methods in this article are suitable for tans only. Exfoliating while you’re burned will be ineffective and extremely painful.\n" +
                    "Apply aloe vera to ease pain and hydrate your scorched skin.\n" +
                    "Revisit this guide once your burn has healed or peeled." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Start with the proper exfoliant. You don’t want to be rough on your skin, per se, but the overall idea here is to speed up the process by which your body sheds its skin cells. Your body wants something good for scrubbing.\n" +
                    "Good exfoliants for this purpose will have retinoids or alpha hydroxyl acids. These ingredients specifically help in skin-cell turnover rates and get rid of color. " +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Use a loofah, not a pouf. Loofahs are dried, tubular gourds, the fibrous fruit of the loofa plant. The pouf, on the other hand, is a synthetic scrubber, made to be a gentler scrubbing tool with maximum lather-up potential. We don’t want gentle for this task—we want the tougher loofah." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Dampen the affected skin. Take a shower and then pat yourself (mostly) dry, or use a wet washcloth on your skin." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Apply the exfoliant to the loofah, and massage your skin with it in a circular motion. The exfoliant and loofah will be providing the grit, so don’t use an overly aggressive technique. Simply rub your skin in small circles, rinse it off with cool water, and repeat daily." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    ""
    };



    private String imgHairCare[] = {
            "hair_care",
            "haircare1",
            "haircare2",
            "haircare3",
            "haircare4"
    };

    private String txtHaircare[] = {
            "<h1>Content:</h1>" +
                    "1.Shiny Hair" +n+
                    "2.Long hair" +n+
                    "3.Hair Fall Control" +n+
                    "4.Dandruff" +n+
                    "",
            "<h1>1.Shiny Hair</h1>"+n+
                    "<h4>Deep Treatment with Coconut Oil</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Massage organic unrefined coconut oil through your dry hair. The coconut oil must be unrefined, otherwise it won't soak into your hair as it should. For the folks with an oily scalp, don't rub too much into your scalp or too close to your hairline. Our main goal is to condition our ends; the scalp is where much of our natural oils are and won't need quite as much attention. Apply coconut oil starting from the ends, then up.\n" +
                    "The amount of coconut oil you use on your hair depends on the thickness and the texture of your hair. Oily hair and scalps need less; drier hair will need more. Do not put generous amounts." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Wash your hair with warm water, then wrap your hair in a shower cap or towel to help contain it." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Keep it like that for at least thirty minutes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Rinse your hair, then shampoo and condition like normal. Rinse hair with cold water. Let hair air dry or dry with a towel around it. Do not rub dry." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Deep Treatment with Eggs</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Deep condition with eggs. Mayonnaise is mostly eggs, so it only makes sense that eggs would also be an effective way of putting moisture and shine back in your hair.\n" +
                    "Crack 2-4 eggs (depending on your hair length) into a bowl. Separate the yolk from the whites, placing the egg whites aside. (A good egg white omelet might be a good way to use them up.)" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Pour olive oil in the bowl, just enough to cover the yolk, and whisk together. Make sure the solution is well blended." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Shampoo your hair in lukewarm water then put mixture in your hair. Let it sit for 5-6 minutes, then rinse again with lukewarm water. Lastly, rinse with cool water." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Deep Treatments with Yogurt</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Use yogurt as a deep conditioner. Brush out your hair well. Find plain yogurt, although plain Greek yogurt works very well also.\n" +
                    "Make sure the yogurt is plain, otherwise you will end up with more sugar and food colourings in your hair — not something you want." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Take the yogurt and spread it all over your hair. Next, take an old hair tie and put your hair into a ponytail or bun. If you wish you can put a bag over it or you can just leave it up." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Leave it in 20-30 minutes or until the yogurt has hardened. It is best to take a shower afterwards and shampoo/condition with a good brand.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Deep Treatment with Aloe Vera and Honey</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Mix together equal parts conditioner, aloe vera gel, and honey. Aloe Vera is an excellent conditioning and rebuilding agent, and honey should add shine.\n" +
                    "People with dark hair should be careful while using honey as it may also lighten your hair color.\n" +
                    "Make sure to get an Aloe that does not contain harmful ingredients such as alcohol.\n" +
                    "A mix of Jojoba oil (instead of Aloe Vera), honey and conditioner also works well." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Massage mixture through dry hair. Leave in hair for 5-10 minutes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Rinse out with shampoo and conditioner." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Deep Treatment with Vinegar</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Shampoo your hair with your usual shampoo. Rinse thoroughly with cold water to eliminate any residual shampoo or buildup that's accumulated on the hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Measure two cups of apple cider vinegar and one cup of water and rinse hair carefully with the mix. Leave vinegar and water mixture on your hair for fifteen minutes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Rinse the vinegar off your hair. Rinse with clean warm running water until the vinegar smell dissipates. Comb out hair carefully and you will find your hair is now detangled, healthy-looking and manageable." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Repeat process every week or less if desired. Apple cider vinegar's acidity is close to that of natural hair, so it's a good conditioner and cleaning agent. It's also an effective germ killer." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Deep Treatment Oil and Shea Butter</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "In a bowl add 1/2 Cups of Olive Oil, Coconut Oil,Castor Oil, Lavender Oil, Rosemary Oil, Almond Oil, and Chamomile Oil." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "In another Bowl Add 1 cup of Shea Butter and 2 tablespoons of Avocado, Jojoba and Wheat germ Oil with a tsp of Honey." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Combine both Bowl mixtures together." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Smooth over your hair and leave it in for 20 to 30 minutes" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Rinse with an Herbal Rinse and let air dry." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Deep Treatment Vegetable Oil and Conditioner</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash your hair with shampoo as usual and rinse. Dry your hair so that it is not dripping." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Mix two tablespoons of vegetable oil with your usual conditioner. You can also use canola oil. Do not use too much oil or your hair with be oily." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Rub through and saturate hair with mixture from root to tip. It is better to section the hair so that all the hair is conditioned evenly. Once you have covered your hair in the mixture, massage your scalp and work the conditioner into your strands of hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Put hair under a shower cap (or a plastic bag). Leave the cap on for about 30 minutes. If you want to, you can sit under a hair dryer to add heat to your hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Rinse your hair. Rinse until you don't see anymore \"milky\" water. Your hair should not feel squeaky clean. You want some of that oil to stay in your hair." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Deep Treatment Hibiscus Leaf Extracts</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Pluck 8-10 leaves from the hibiscus plant. Soak the leaves well in water for 10 minutes" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Extract the gel out of these leaves. Do this by squeezing into a dish." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Apply the gel on dry hair. Leave for 30-60 minutes." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Wash the gel off using a mild shampoo." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Do this once in a week for continuously shiny soft hair." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Avoiding Damaging Practices</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Don't use products that contain Sodium Lauryl Sulfate or Ammonium Laureth Sulfate. This is especially important if you have curly hair. Look closely at the labels of shampoos and conditioners before you purchase and use them.\n" +
                    "Although Sodium Lauryl Sulfate is derived from palm and coconut oil, it has been linked to skin irritation and hair loss. It is also used as an industrial-grade cleanser.\n" +
                    "On the other hand, mild cleansers aren't likely to get rid of silicone or wax. So make sure that you don't get silicone or wax into your luscious locks!\n" +
                    "Try looking for shampoos and conditioners with natural and organic ingredients. Natural ingredients will restore natural oils to your hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Don't wash out all of your conditioner. If someone ever told you \"wash it til it squeaks,\" that person was wrong. When you are washing it out, wash it out until it still feels like there is a bit in there and then (without touching) pour cold water over your head with the shower head. Don't rinse anymore or run your fingers through it. Just pour.\n" +
                    "Leave-in conditioners are also widely available. Spray it in your hair after you've shampooed and showered, and leave it in until the next time you shower.\n" +
                    "Some leave-in conditioners help you style your style in addition to adding hydration. They are essentially a frizz-control agent. Just make sure that your hair isn't weighed-down and greasy after application." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Avoid non-organic styling chemicals as much as possible. Dyes and relaxers can be very bad for your hair. If you feel like you have to do it, make sure not to leave the chemicals in your hair too long. Apply sparingly to prevent hair damage. Read the product's instructions to see how often you're supposed to wait between treatments.\n" +
                    "Keratin treatments, or Brazilian hair blowouts, can be especially damaging to your hair. They contain high levels of formaldehyde and can make your hair fall out." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Avoid too many sessions with the straightener. You may love your straightened hair, but your hair does not love your flat iron. Straighteners can overheat and damage your hair, leaving it dry and brittle." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Good Hair Practices</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Have someone trim your ends every once in a while. If you think you can do it yourself, go ahead. Split ends can make your hair look more dull, dry, and damaged." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Brush your hair the right way. We all know we need to brush our hair to get it looking its best, but there's an art to brushing that many people miss out on.\n" +
                    "Avoid brushing wet hair. It's hard to do, but wait for your hair to dry out a bit before you bring the brush down on it. When you need to brush wet hair, use a wide-toothed brush with rounded tips. This will help cut down on split ends and reduce torn hair.\n" +
                    "Don't rip your brush through snarls. If you don't have detangler spray, wet the area and apply lots of conditioner to work it through evenly. Sleeping with your hair in a bun or braid can make it easier to brush in the morning, and will control some of the frizz (if you have it). Brush gently and slowly work the tangles out.\n" +
                    "Don't over-brush. Some people say that brushing your hair 100 times a day will help bring blood to your head and stimulate hair growth. There is no scientific evidence to suggest this is true. In fact, over-brushing can cause cuticle damage and breakage." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Eat a variety of fruits, vegetables, and other healthy nutrients. Drink lots of water. You are what you eat, in a way, and so is your hair. Eat healthy for healthy hair. Also, eat lots of protein because it will help strengthen your hair, improving color and shine. This is because your hair is made of protein." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "",
            "<h1>2.Long hair</h1>" +n+
                    "<h4>Taking Good Care of Your Hair</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Change the way you wash your hair. Factors like how often you wash your hair and what water temperature you use can affect the length of your hair. That's because washing your hair too often (think every day) and using super hot water will cause it to dry out and become brittle. That leads to hair breakage, preventing your hair from growing long and thick. The solution? Wash your hair no more than 3 times a week, and use the coldest water you can handle.\n" +
                    "At first, washing your hair less often might make it look a little greasy. Wear a hat for a few days until your scalp gets used to producing less oil and things balance out. It shouldn't take long!\n" +
                    "If you hate showering in cold water, try washing your hair in the sink with cold water separately from your regular showers. When you shower, keep your hair wrapped up in a shower cap." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Dry your hair gently. Do you towel dry your hair roughly, brush it out, and blow it dry? You're breaking your hair! It won't get the chance to grow long and strong, because you're handling it too roughly while it's wet. Think of your hair like a garment made of good fabric; you wouldn't just throw it in the dryer, you'd carefully lay it out to gently air dry. Treat your hair with the same gentle care. After washing, gently pat it dry with a towel and let it finish air drying.\n" +
                    "Don't brush your hair while it's wet. Wet hair tends to stretch and break more easily than dry hair. If you need to detangle it, use your fingers and a wide-toothed comb to gently work through the tangles.\n" +
                    "Don't blow dry your hair except for special occasions. Blow drying often really does cause damage in the form of breakage, frizz and split ends, and it's not easy to repair; you just have to wait for fresh hair to grow out." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Don't use harsh chemicals on your hair. The shampoo and conditioner you use may be contributing to poor hair growth. Most commercial shampoos contain sulfates, which strip your hair of its natural oils and leave it susceptible to damage. Conditioners contain silicones that coat the hair with chemicals and need to be washed out with more strong shampoo. This cycle is really damaging to hair! Here's what you can do instead:\n" +
                    "Give your hair one last wash with a strong shampoo, to get rid of any remaining silicones. Don't condition it this time; just gently detangle it and let it air dry.\n" +
                    "Give your hair a break for a few days. Don't do anything to it - don't wash it, straighten it, or use any products.\n" +
                    "Next time you wash your hair, use an all-natural shampoo. Read the label and use a shampoo that contains only natural oils and other cleansers, no chemicals. You could even try going shampoo free!\n" +
                    "Condition with diluted apple cider vinegar. This really works, and when it dries you won't smell like vinegar at all. For a deep-conditioning treatment, try using coconut oil. You'll never want to go back to the chemical-laden stuff you used before." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Try all-natural hair styling techniques and products. In a similar vein, start using gentler methods when it comes to styling your hair. Use heating tools like curling irons, straighteners, and of course hair dryers only sparingly. Switch out chemical-filled hairsprays and gels for natural versions. This gives your hair the chance to grow long and strong, taking on its own unique, beautiful texture.\n" +
                    "You can make your own hair gel from non-harmful ingredients.\n" +
                    "To smooth flyaways and frizz, apply a little argan oil or another cosmetic oil to your hair, rather than using an over-the-counter product.\n" +
                    "Try natural methods to curl your hair without heat or to straighten it without heat." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Use a mask on your hair once every two weeks. This will help repair any damage that's been done to it by replenishing your hair's moisture. Afterward your hair will feel soft, silky and healthy, and it'll stay healthy long enough to keep growing out.\n" +
                    "Try a hot oil mask using coconut and almond oil, as coconut oil has high penetration and deep conditioning power while almond oil adds extra shine to the weak dry hair. Massage the oil into your hair and put on a shower cap. Run a warm blow dryer over the cap for about 10 minutes, then remove the cap and wash your hair. Alternatively, apply the hair mask and braid your hair then put it in a bun and put a shower cap on. Keep your hair braided for at least day and night for three months and you hair will grow 1-3 inches more than normal hair growth.\n" +
                    "You could also try using warm olive oil, cinnamon and honey - this lightens your hair as it conditions it." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Protect your hair from external damage. Cover it up when you spend long hours in the sun, swim in a chlorinated pool, or hang out where there's a high level of air pollution. Your hair can get damaged by repeated exposure to these elements, so tie it up in a scarf, wear a hat or swim cap, and make sure to use gentle washing and drying methods afterward to keep it healthy.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Caring for Yourself and Your Hair</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Schedule regular trims. While cutting your hair often will not cause it to grow faster, trimming your hair regularly will help to maintain its length. Trim your hair every 6 to 8 weeks to rid your locks of damaged ends and to prevent split ends from re-splitting. When you maintain this hair trimming schedule, it will only be necessary to cut approximately ½ an inch off your tresses each time." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Shampoo less. Shampooing your hair strips the scalp of its natural, nourishing oils. These oils ensure the health of your long locks. If you choose to use shampoo, apply the product 2 to 3 times per week and always condition your hair after. If you wish to avoid shampoo, replace the product with cleansing conditioner.\n" +
                    "Always apply shampoo directly to the scalp and conditioner to the ends of your hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Dry your hair with care. After showering, squeeze the excess water from your locks with a towel. Use a wide tooth comb to detangle your long locks. When possible, leave the blow-dryer in the drawer and air dry your tresses.\n" +
                    "Avoid roughly rubbing your hair with a towel—this leads to frizz and split ends." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Maintain a healthy diet. Your diet impacts the health of your hair. To maintain a healthy shine to your long mane, drink lots of water and eat a diet rich in vitamins A, B, C, D, E, and K. \n" +
                    "To increase your intake of vitamins A, C, E, and K, consume more mangos, kale, spinach, sweet potatoes, avocados, and apples.\n" +
                    "To increase your intake of vitamins B and D, eat more animal products. These include fish and dairy products." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Avoid tight hairstyles. While ponytails, braids, and top-knots are adorable and stylish, the tension these hairdos place on your hair can cause damage. The optimal style for long locks is to wear your hair down. If you prefer to pull it up and back, opt for a low chignon or ponytail, and don't wrap the hair too tightly." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Reduce your hair’s exposure to friction. When your hair rubs against certain fabrics, the resulting friction causes split ends. Pull your hair up into a low bun or sweep it to the side when you wear fur, faux fur, or wool." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Choosing the Right Products and Tools</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Choose nourishing products formulated for your hair type. When selecting products, read the label and ingredients list carefully. Always buy products that are formulated for your specific hair type. Avoid products that contain sodium lauryl sulfate, sodium laureth sulfate, and isopropyl alcohol. Instead, seek out products that contain natural items, like avocado oil, honey, and or coconut milk.\n" +
                    "Don’t haphazardly test new products on your hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Select your heat tools carefully. Routinely exposing your hair to excessive or harsh heat will damage your long locks. If possible, invest in salon quality tools.When purchasing a flat iron or curling iron, opt for a tool that lists its temperature in degrees instead of “High,” “Medium,” or “Low.” This feature will allow you to control the temperature. When buying a blow-dryer, search for a product with a heat distributing nozzle and or a diffuser attachment. These features spread the heat evenly throughout your hair. " +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Purchase a high-quality hairbrush. When you have long locks, a great hairbrush is a worthwhile investment. Select a brush with natural bristles—a boar bristle round brush is ideal. Your brush should be firm enough to detangle your hair, yet gentle enough so that it does not pull too hard on your hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Limit your use of hair dyes and hair products. Hair dyes will damage your hair and overusing products will weigh it down.\n" +
                    "It is best to simply avoid dying your hair—wear your natural color proudly. If you choose to dye your locks, only dye your hair when it absolutely needs it.\n" +
                    "Use a marginal amount of hair products to keep your long locks full and bouncy. Over time, hair products build up on your scalp. Using too many products will weigh down your already heavy locks, causing them to look lifeless and flat." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Protecting Your Hair at Night</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Brush your hair before bed. Your bedtime routine should include brushing your hair. Run through your locks with a wide toothed comb or a boar bristle brush. Brush your hair from root to tip several times. This will detangle your locks and spread your scalp’s natural oils throughout your hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Use scrunchies at night. When worn at night, elastic bands can cause undue damage to your roots and hair shafts. If you prefer to wear your hair up at night, trade your elastic band for a scrunchie. Before bed, twist your hair into a top-knot and secure the high bun with a scrunchie." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Sleep on a silk pillowcase. When your hair comes into contact with a cotton pillowcase, the resulting friction damages your long tresses. Upgrade to a silk pillowcase to prevent split ends. If you cannot afford a silk pillowcase, wrap your hair in a silk scarf." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Consider using a sleeping cap. Waking up with tangled tresses is never fun. Protect your hair at night with a sleeping cap. Sleeping caps constrain your hair—when your hair moves less at night, you wake up with fewer snarls." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "",
            "<h1>3.Hair Fall Control</h1>" +n+
                    "<h4>Topical Treatments</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Use essential oils combined with a scalp massage. Massage promotes good circulation in the scalp, to keep your hair follicles active. Massage your scalp daily by hand for a couple of minutes. To enhance the massage, use a few drops of lavender or bay essential oil in an almond, or sesame oil base on your scalp." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Use egg oil (eyova). Massage egg oil into the scalp and leave on overnight.\n" +
                    "Shampoo off in the morning with a mild, preferably herbal shampoo. Use shampoo only once as repetition removes the natural lipids of hair making it dry and brittle.\n" +
                    "Use egg oil 2-3 times a week for at least 12 weeks for visible results. Regular, continued use is important for proper nourishment of the cell membranes.\n" +
                    "Continue long term massage therapy of egg oil to prevent hairfall and graying. Discontinuing use may gradually bring back hairfall problems and resume graying.\n" +
                    "Egg oil (eyova) is mess free and stable. It is a more convenient alternative to egg yolk masks and does not smell like raw egg yolks or cook in the hair during a hot shower. There is no risk of salmonella which could give you a scalp infection.\n" +
                    "You can make egg oil at home [[1]] or buy it online." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Restore moisture through hot oil treatments. You can use any natural oil including safflower and canola or olive oil. Use this method judiciously as frequent use of hot oil or using oil which is too hot can bring on premature graying.\n" +
                    "Heat the oil up so it is warm, but not too hot. The ideal temperature is not exceeding 40 degrees Celsius (104 degrees Fahrenheit). Then, massage the oil into your scalp.\n" +
                    "Put on a shower cap for about an hour. When the hour is up, rinse or shampoo out the oil.\n" +
                    "Mayonnaise also works well as a conditioner. Slather your hair with a generous dollop, put on a shower cap for up to an hour, and then rinse it off." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Try rubbing your scalp with garlic juice, onion juice, or ginger juice. Make sure you only use 1 of these juices; don't mix them. Leave the juice on your scalp overnight, and wash it out in the morning." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Rub rangoli henna into your hair. It is a green powder with the texture of talc that seals the hair cuticle, which strengthens the hair shaft at the root." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Rub green tea into your hair. The tea contains anti-oxidants, which may prevent hair loss and help hair growth.\n" +
                    "Brew 2 bags of green tea in 1 cup of water. Let the tea cool slightly, and then apply it to your hair.\n" +
                    "Leave the tea on for 1 hour. Then, rinse your hair thoroughly." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Boil potatoes and rosemary in water on your stove top. Strain the liquid, and use it daily as a hair rinse." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Try fenugreek (methi) seeds treatment. This will provide shine and add strength to hair with regular use, helping to keep hair intact.\n" +
                    "Soak and grind one cup of fenugreek (Indian methi seeds) with sufficient water to make a paste.\n" +
                    "Apply to the scalp and massage it lightly.\n" +
                    "Leave it for half an hour.\n" +
                    "Rinse out with cold water." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 9</b>" +n+
                    "Try aloevera juice and neem paste. This treatment is good to control hair fall.\n" +
                    "Mix aloevera juice with neem powder and add two-three drops of coconut oil.\n" +
                    "Apply it on your scalp and leave it for half an hour.\n" +
                    "Wash it off with shampoo. Follow this treatment once in a week for the desired results." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Lifestyle Changes</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Include more high-protein foods in your diet. Eating lean meats, fish, soy, or other proteins may help to curb hair loss. Besides containing protein, many foods rich in protein also contain Vitamin B-12." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Take care of the hair that you have. Never brush wet hair, and avoid rubbing your hair dry with a towel. Instead, let it air dry or else blow dry it to the point of dampness, and let it dry from there." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Reduce stress. Sometimes, the root cause for hair loss is stress.\n" +
                    "Practice meditation. Meditation can help to both reduce stress and restore your hormonal balance. Practicing meditation can also help you in other aspects of your life.\n" +
                    "Get some exercise. Walk, swim, or bike for 30 to 60 minutes per day. Or, try playing a sport like tennis, so you can take out your aggression by hitting a ball. The exercise will help to lower your stress levels.\n" +
                    "Talk or write it out. Talk to your spouse, a friend, or family member, or to a therapist about what you are experiencing. Take the time to record your feelings in a journal." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Avoid wigs or hairpieces. While these may seem like good cosmetic solutions, they may also speed up hair loss by damaging your hair follicles.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Herbs and Supplements</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Treat with saw palmetto. Native Americans use saw palmetto to promote healthy hair and skin. Saw palmetto also blocks the production of DHT (a metabolite of testosterone), a contributing factor to enlarging of the prostate. Because DHT production also causes hair loss. However, no authentic clinical reports support use of saw palmetto to be effective for preventing hair loss." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Take vitamins. Your mother told you they were good for you, but you may not know that they are good for your hair, too. Add some extra milligrams of these vitamins to your daily regimen:\n" +
                    "Vitamin A: Vitamin A is an anti-oxidant, which promotes healthy production of sebum in the scalp. Sweet Potatoes are loaded with beta carotene - rich in Vit A not only promotes a healthy scalp but promotes hair growth.\n" +
                    "Omega-3: Take Omega-3 fatty acids. Foods rich in Omega-3 are fatty fish, egg yolks, fish eggs (caviar) and milk.\n" +
                    "Vitamin E: This vitamin stimulates circulation, and good blood circulation in the scalp is important in keeping your hair follicles productive.\n" +
                    "B vitamins: The B vitamins help your body produce melanin, which gives hair its healthy color. Melanin also stimulates blood circulation." +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    "",
            "<h1>4.Dandruff</h1>" +n+
                    "<h4>Lemon Juice</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Apply some lemon juice to your hair and scalp. Distribute evenly.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Give some time to the lemon juice to react, approximately 20-25 minutes. The scalp would itch, but don't worry, this is normal." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Wash your hair thoroughly. If required, use shampoo too.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Olive Oil</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Use olive oil. Apply olive oil before washing your hair. Let it do its stuff for about 5-10 minutes before washing your hair." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Before going to bed, apply olive oil once more. You may wish to wrap your head in a towel or cotton cap, or use an old pillowcase to absorb the oil. You should wake up to a dandruff free head." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Egg Yolks</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Mix the yolks of 1 to 2 eggs." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply to a dry head. As much as possible, place it onto just the scalp area." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Put a plastic bag over the scalp/hair. Be warned - the egg has a bad smell and it leaks." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Leave it on your scalp for 1 hour.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Wash thoroughly with a good shampoo. You might have to wash your head twice to take it out.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Recommended Scalp Care</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash your hair regularly, but not obsessively. Dandruff is caused when your scalp sheds dead skin cells. It is not caused by hair itself.\n" +
                    "The Mayo Clinic recommends washing your hair every day with a dandruff shampoo until the flakes subside, and then continuing to wash your hair with the anti-dandruff shampoo 2-3 times per week.\n" +
                    "Excessive shampooing, especially with harsher chemicals, such as lauryl sulfate, can irritate the scalp and dry it out, causing more dandruff." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Give your dandruff shampoo time to work. If you choose to wash your hair with dandruff shampoo, leave the shampoo in for at least 5 minutes before you wash it off. This will give the shampoo time to work." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "To help prevent dandruff, brush your hair after you shower and shampoo. Brushing your hair will help distribute the oil that is naturally occurring in your scalp and hair over the entire surface of your head.\n" +
                    "Starting at your scalp, brush outward to help distribute oil from the scalp along your entire head." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Avoid stress and stressful situations. Stress can cause dandruff, so try to exercise your stress away or deal with your stress in other healthy, effective ways.\n" +
                    "Eat healthily. What you put into your body has an impact on what your body responds with. An excess of unhealthy foods (fast food, sugary foods, etc.) will often result in skin, scalp and hair problems.\n" +
                    "Foods rich in zinc and vitamin B6 are particularly important for maintaining healthy hair and scalp." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Fenugreek Seeds</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Grind one tablespoon of methi seeds roughly. Do this by hand; do not use a mixer." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Soak the seeds in two cups of hot water." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Leave this mixture overnight." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Strain. Use the water as a rinse." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Baby Oil</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Apply baby oil onto scalp. A little bit will go a long way. Massage the scalp but not too roughly." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Cover your hair with a towel and leave the baby oil in overnight." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Wash with a good anti-dandruff shampoo in the morning. The oil should condition your scalp while you're sleeping." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Baking Soda</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Replace your shampoo with a handful of baking soda. Baking soda is used in a wide variety of ways, and is reputed to work as a natural dandruff remover." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Instead of shampooing, rub a heaping tablespoon of baking soda into your wet hair and scalp. Wash thoroughly after one minute." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Wait for the baking soda to work its magic. After two weeks of your baking soda shampoo, your scalp should begin producing natural oils, leaving the skin on your head moisturized and dandruff-free." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Lemon Juice and Curd</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Get a bowl of curd and cut a lemon in half." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Squeeze the lemon into the curd and mix together. Keep the piece of peel from the lemon." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Apply the curd on your hair. Use the peel to apply and rub through with." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "After the curd is on your hair, massage the scalp with the inside of the lemon skin." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Repeat often. Soon you will have no more dandruff." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Make sure to shampoo after applying curd, since it usually leaves a very repugnant odour." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Baking Soda and Lemon</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Mix freshly squeezed lemon juice with baking soda.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply to scalp. Leave for a few minutes.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "When the scalp begins to feel itchy, wash out.\n " +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Rinse hair. Use apple cider vinegar as a conditioner.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Coconut Oil</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash your hair, but do not use any conditioners. Dry your hair after showering. Make sure your hair does not feel silky, it has to feel dry.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Put coconut oil on your scalp, try to avoid getting it in the rest of your hair.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Wash coconut oil out. Make sure you get it all out. You may have to wash your hair twice to get it out, but once should be fine.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Repeat this once weekly until dandruff is gone.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Tea Tree Oil</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Get shampoo with tea tree oil and use frequently. Tea tree oil smells fantastic and is a natural antiseptic. Shampoos with at least 5% tea tree oil have been shown to effectively treat dandruff." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Rub the tea tree oil shampoo into your scalp and let sit for 5 minutes.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Rinse with water, repeating once per day.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Mouthwash</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Mix 1 part mouthwash with 9 parts water. Pour onto hair after the usual hair wash.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Simply dump the mixture over your head. Then style as normal. Do not rinse out.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Apple Cider Vinegar</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Take one part apple cider vinegar and mix it with one part water. Wash your hair normally, then pour vinegar-water mixture carefully onto hair and scrub into your scalp. Take care not to let any get into your eyes. If you have psoriasis or any unhealed scratch or scab, it will burn (if it burns, just rinse the affected area with water).\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Leave on for 10-15 minutes, then rinse with water. The vinegar smell will disappear once your hair is dry.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Repeat daily for about a week.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Aspirin</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Break up two tablets between a thin cloth or napkin. Use a hammer or lightly pound on the aspirin with a cast-iron pan.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Instead of ingesting the aspirin, add the crushed aspirin-powder to your regular shampoo.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "When shampooing, leave the shampoo in your hair for two minutes before rinsing.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Cedarwood Oil</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Mix essential oils of cedarwood (seven drops) cypress and juniper (each ten drops) in 50ml of carrier oil.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Rub well into the scalp and leave for one hour. To remove, rub neat, mild shampoo into the hair, then wash out with warm water.\n" +
                    "To keep dandruff at bay, use the same quantities of the oils in 600ml of warm water. Stir well and use as a final rinse." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Banana and Vinegar</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Peel a whole banana. Mix with two cups vinegar.\n" +
                    "Stir until completely combined. You may want to use a fork or whisk to make a paste." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply the mixture into hair. Take extra care to massage the mixture into your scalp. Continue for 5-10 minutes or until the mixture covers your hair completely." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Leave in for 15-20 minutes. Then, rinse the mixture out completely." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Repeat every day for one week. Then, you can do this once a week as a preventative treatment." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Baking Soda and Vinegar</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Rinse your hair with cold water - the colder the water is, the better." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Mix malt vinegar with white wine vinegar at a ratio of 1:1. Then mix this mixture with water at a ratio of 1:1. Make about 70-100ml." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Once your hair is damp, but not soaked, add this mixture to the top of your head. Work it into your scalp vigorously and work it through your hair. Leave for approximately 5-10 minutes. It will sting a bit after a while but this is just it ridding the dead skin cells that cause dandruff." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Then rinse with cold water thoroughly. Really clean the scalp vigorously.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Get half a tablespoon of baking soda. Mix it with 30-40 ml of water into a slight froth.\n" +
                    "" +n+n+
                    "</p>" +"<p>" +
                    "<b>Step 6</b>" +n+
                    "Make sure your hair is damp, not soaked, and add this mixture to the top of your head. Work it into your scalp vigorously and work it through your hair. Leave for approximately 3-5 minutes. It will sting a bit. More so than the vinegar and faster, however, this is it just getting rid of the dead skin cells that cause dandruff.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Rinse with cold water thoroughly. Clean the scalp vigorously.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Dry your hair with a towel very gently. Let it dry naturally. Once dry, point your head to the floor and work your hands through your hair slowly. Rubbing your hair to get any last of the remaining flakes. Well done, you should now be dandruff free!\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Yogurt</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Just wash and rinse your hair, then rub plain yogurt into the scalp, and leave for 10-15 minutes.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Rinse, then wash again, using as little shampoo as necessary. An infusion of thyme, nettle or sage with 2 tablespoons of vinegar can be used as a final rinse. To make an infusion, fresh or dried herbs can be used in loose or tea-bag form.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Warm a teapot and put in 1 dessertspoon of herb for each cup required.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Pour in a cup of boiling water for each cup of tea. Allow to steep for 10-15 minutes, then wash out the yogurt into a dish. Add the remainders for a healthier scalp.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Neem and Olive Oil</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Take 2-4 Himalaya neem capsules.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Remove the outer cover of capsule. Inside you will find neem powder in a coarse form.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Take 4 tablespoons of olive oil or any oil of your choice.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Mix the oil and powder. And apply on your scalp. You will feel the itching but that's normal.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Keep it for 1 hour to overnight (depends on your choice). Wash with shampoo and conditioner. Repeat as required.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Fuller Earth</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Make a paste of water and fuller earth and then add lemon juice into it.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply it on your hair and scalp.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Allow it to sit there for about 20 minutes then rinse it off with water.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Egg oil (Eyova)</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Massage egg oil well into the scalp for 5-10 minutes and leave it on overnight. Egg oil contains:\n" +
                    "Long chain polyunsaturated Omega-3 fatty acids like Docosahexaenoic Acid (DHA) which revitalize the follicle cells.\n" +
                    "Cholesterol which brings luster and shine to hair as well as eliminates dandruff." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Shampoo off in the morning with a mild, preferably herbal shampoo. Use shampoo only once as repetition (for a foamy feel) removes the natural lipids of hair and scalp making it dry and brittle.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Use egg oil 2-3 times a week for at least 12 weeks for visible results. Regular, continued use is important for proper nourishment of the follicular cell membranes.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Continue long term massage therapy of egg oil to prevent dandruff recurring.\n" +
                    "Egg oil is mess free and stable. It is a more convenient alternative to egg yolk masks and does not smell like raw egg yolks or cook in the hair during a hot shower. There is no risk of salmonella which could give you an infection." +
                    "" +n+n+
                    "</p>" +
                    "<h4>Coconut and Honey Scalp Scrub</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Mix coconut oil, olive oil, yoghurt and honey together. You'll want your four ingredients to be in a roughly 2:2:3:2 ratio so that they form a paste of medium consistency - smooth, but not so liquid that it will run off of your head. Add more yogurt and honey to thicken as needed." +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Massage the mixture into your scalp. Spend time spreading the mixture evenly from your roots to the end of your hair. Do this for about 10 minutes. This opens up the pores on your head and promotes blood circulation. Plus, it just plain feels great.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Let the rub set for 20 minutes In a high-humidity environment. Try sitting under a steamer as you allow your rub to set. Or, if you don't have have a steamer, let the rub set while you take a hot bath. If you don't have a bathtub, no worries - just allow the rub to set for a little longer (30-45 minutes).\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Rinse using shampoo until your scalp feels clean. Hop in the shower and wash your hair. Usually, you'll need to shampoo and rinse twice to get all of the rub out of your hair. Don't overdo it - this can strip the scalp of the moisture provided by the rub. Use your daily conditioner for the ends of your hair only.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "If using a hair dryer, use a low setting. Dry heat, such as that from a hair dryer, can contribute to a flaky, dandruff-y scalp. If you typically style your hair using a blow dryer, blow dry your hair delicately, making sure not to apply too much heat directly to your scalp. Optionally, use a hair straightener to style as you normally would.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Finish your hair with a coconut oil sheen. Take four to five drops of coconut oil in the palm of your hand and rub both hands together - this will warm the oil. Run both palms through your hair, transferring the oil onto your hair and scalp. Repeat as needed to cover all of your scalp.\n" +
                    "" +n+n+
                    "</p>" +
                    "<h4>Orange Peel Pack</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Mix lemon juice and orange peel in a food processor to make a paste.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply it to your scalp.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Allow to sit for 30 minutes and then rinse it off with a shampoo.\n" +
                    "" +n+n+
                    "</p>" +
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Follow this method about 2-3 times a week for expected results.\n" +
                    "" +n+n+
                    "" +n+n+
                    "</p>" +
                    ""
    };



    private String imgSkinCare[] = {
            "skin_care",
            "skincare1",
            "skincare2",
            "skincare3",
            "skincare4",
            "skincare5",
            "skincare6",
            "skincare7"
    };

    private String txtSkinCare[] = {
            "<h1>Content:</h1>" +n+
                    "1.Whiten Skin" +n+
                    "2.Wrinkles Cure" +n+
                    "3.Winter Skin Care" +n+
                    "4.Summer Skin Care" +n+
                    "5.Oily Skin" +n+
                    "6.Dry Skin" +n+
                    "7.Natural Moisturizer" +n+
                    "",
            "<h1>Whiten Skin</h1>" +n+
                    "<h4>Using Skin Lightening Masks</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Make a mask from potatoes. Potatoes are said to have mild bleaching properties. This mask will help to lighten dark spots. \n" +
                    "Peel a potato and grate it.\n" +
                    "Add some rose water to the grated potato and mix it to make a paste.\n" +
                    "You can add lemon juice to the mixture if your skin is oily for a natural toner and astringent.\n" +
                    "Apply the mixture to your face and leave it on for 15 minutes.\n" +
                    "Rinse your face with water to wash away the mask." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Use a lemon or orange rind mask for skin whitening. Citrus fruits are acidic and contain vitamins that are good for skin health. The acidity of these fruits will help to lighten darkened areas on the skin.\n" +
                    "Take some lemon zest or orange zest and dry it in the sun. Crush it to make a powder.\n" +
                    "Mix the zest with some milk to make a paste.\n" +
                    "Apply this mixture to the face, massaging it in with small circular motions.\n" +
                    "Leave it on your face for 15-20 minutes then wash it off with warm water.\n" +
                    "Follow up this skin-care routine with a cooling toner." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "\n" +
                    "Make a facial pack from cucumber. Cucumber has a cooling effect on the skin and its astringent properties can help to lighten skin. [3]\n" +
                    "Peel a cucumber, then grate it.\n" +
                    "Squeeze the flesh to remove the juices.\n" +
                    "Mix the grated flesh with some aloe vera gel for a cooling, healing effect.\n" +
                    "Apply this pack to the face and let it sit for 15-20 minutes.\n" +
                    "Rinse with cool water." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Try a mask made from milk, lemon juice, and honey. Honey is said to have antibacterial properties and lemon juice is a known astringent.\n" +
                    "Mix together 1 teaspoon each of milk, honey and lemon juice.\n" +
                    "Make sure all the ingredients are well mixed before applying the mixture to your face.\n" +
                    "Apply this mask to cleansed skin and let it sit for 20 minutes.\n" +
                    "Rinse the mask off with warm water. Your skin should be left feeling soft." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Try a tomato, oatmeal, and yogurt mask for bright skin. Yogurt is said to have mild bleaching properties as well as being helpful in preventing blemishes. Oatmeal helps to exfoliate the skin, whereas tomato juice can naturally lighten skin as it is a strong, acidic astringent.\n" +
                    "Mix together equal parts tomato juice, oatmeal, and yogurt.\n" +
                    "Apply the mask to cleansed skin.\n" +
                    "Leave this mask on for 15-20 minutes.\n" +
                    "Rinse the mask off with warm water and pat the skin dry." +
                    "</p>" +
                    "" +n+n+

                    "<h4>Lightening Skin With Natural Toners</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Make a lightening toner from tomatoes. Because tomato is acidic in nature it can help to lighten skin. \n" +
                    "Mash a ripe tomato and strain the juice to remove the seeds.\n" +
                    "Apply the juice to your face as a toner with a cotton ball.\n" +
                    "Leave it on until it dries, then rinse your face with warm water." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Use lemon juice as a skin lightener and toner. Lemon juice can be harsh on dry and sensitive skin, however.\n" +
                    "Squeeze the juice of a lemon.\n" +
                    "Apply it to the face as you would a regular facial toner.\n" +
                    "Wet a cotton ball with lemon juice and wipe it across your face.\n" +
                    "Avoid the area around the eyes when applying this toner.\n" +
                    "Don't go out in direct sunlight after applying the lemon juice to your skin as it can increase sensitivity to UV rays.\n" +
                    "If you find the lemon juice is too harsh on your skin, you can dilute it with honey and water." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Make a toner from raw papaya juice. This can act as a very mild skin lightener.\n" +
                    "Grate a fresh, ripe papaya.\n" +
                    "Squeeze the juice from the fruit.\n" +
                    "Soak a cotton ball with the papaya juice.\n" +
                    "Wipe the cotton ball across your skin.\n" +
                    "Leave the toner on for 20 minutes.\n" +
                    "Rinse your face with warm water." +
                    "</p>" +
                    "" +n+n+

                    "<h4>Preventing Skin Darkening</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Avoid sun exposure. This means you should avoid being out in the sun during the times of day when UV rays are at the highest. [5]\n" +
                    "This is when you are most likely to get a tan or sunburn.\n" +
                    "In most places, this is from 10AM to 4PM.\n" +
                    "If you must go outside, stay in an area with a lot of shade." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Wear a hat and sunglasses. This will prevent tanning on your face. [6]\n" +
                    "Most medical professionals state that wearing a hat with a wide brim can protect your face.\n" +
                    "The brim of the hat should be at least 4 inches (10cm).\n" +
                    "This will protect your scalp, face, nose, and neck from sun exposure.\n" +
                    "Sunglasses will help to protect your eyes from harmful UV rays, as well as shade the skin surrounding them." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Wear protective clothing. Make sure your arms, legs, and torso are adequately covered.\n" +
                    "Lightweight, breathable fabrics will be the most comfortable in hot weather.\n" +
                    "Light colors will be cooler than dark colors in bright sun.\n" +
                    "Some fabrics are designed for sun protection. Clothes made from this fabric will have a label indicating how much protection from sun they offer." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Consider wearing sunscreen. While most sunscreens are not a natural product, they have been proven to work to prevent sunburn and tanning.\n" +
                    "Choose a sunscreen that is at least SPF 30 or higher. Anything less does not offer adequate protection.\n" +
                    "Apply this generously to all exposed skin.\n" +
                    "Be sure to apply sunscreen to your face, especially.\n" +
                    "Zinc oxide is also a good protector from UV rays. You can apply this to your nose to prevent sunburn or darkening." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Wrinkles Cure</h1>" +n+
                    "<h4></h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Drink eight full glasses of water each day. This will keep your skin hydrated, which will gently plump up existing wrinkles and discourage new ones from forming." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Avoid using facial products containing alcohol. Alcohol is drying and can cause wrinkles to form. Use products containing water or witch hazel instead." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Wear sunglasses whenever you go out in the sun. This will keep you from squinting, which will prevent the fine lines around your eyes from turning into deep wrinkles." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Use facial creams containing light, natural oils, such as evening primrose oil or avocado oil. These will absorb into your skin easily and plump up existing wrinkles.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Apply moisturizer as soon as you wash your face or shower. This will lock the water from washing into your face, keeping your face hydrated and smoothing out wrinkles." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Use a sunscreen with an SPF of at least 15 whenever you go outside. Prolonged exposure to sunlight can toughen and age skin, leading to wrinkles. Sunscreen helps block these damaging effects.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Use a skin-tightening mask to treat your wrinkles. Facial masks containing mineral clay and witch hazel shrink pores and tighten skin to naturally reduce the appearance of wrinkles. Leave the mask on for no more than half an hour, to avoid drying out your skin, then wash it off with warm water.\n" +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Winter Skin Care</h1>" +n+
                    "<h4></h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Humidify your home and office. Heated homes and offices make the air around you very dry. Humidifiers don't have to be expensive. You can buy a basic humidifier at your local drug or discount store relatively inexpensively. Place several humidifiers around your home.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Moisturize your skin frequently with an oil-based moisturizer. Ointments contain more oil than do lotions and will help better protect your skin in winter. Petroleum jelly is a good moisturizer to use in the winter although some experts suggest lighter ointments.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Look for moisturizing products that contain glycerin, shea butter, jojoba oil or sunflower oil.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Apply sunscreen to exposed skin when you go outdoors. If you live in an area where there is a lot of snow, this is even more important as snow reflects 80 percent of the sun's light. Look for sunscreen products with built-in moisturizing cream.\n " +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Wear gloves to help keep hands dry and protected from harsh conditions and rough fabrics. Be sure the material used in your gloves doesn't irritate your skin. A pair of thin cotton gloves worn underneath heavier gloves or mittens will keep your hands from becoming irritated.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Wear layers of clothing so it is less likely you will overheat, sweat and lose moisture. Wet clothing irritates your skin. When you dress in layers, you can remove excess clothing as you warm up.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Avoid any skin products containing alcohol or those that reduce oiliness. Try not to use anti-aging products or those for treatment of acne if possible as those tend to dry out skin even more.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 8</b>" +
                    "Remember to keep your lips moist. Since your lips are moist to begin with, exposure to harsh elements makes them especially susceptible to damage. Use lip balm or other protection at all times.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 9</b>" +
                    "Keep baths short. Don't use extremely hot water. Pat yourself dry instead of rubbing. Moisturize after your bath.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 10</b>" +
                    "Exfoliate gently. If possible exfoliate and moisturize at the same time. Any skin that has been irritated is more susceptible to additional damage.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 11</b>" +
                    "Use Vitamin C to repair your damaged skin. Find a serum product with L-ascorbic acid or Vitamin C Ester as an ingredient.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 12</b>" +
                    "Hydrate yourself. Drink water and other hydrating fluids and eat foods rich in oils such as salmon and avocado. Limit caffeine and alcohol.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 13</b>" +
                    "Protect your child by following many of these recommendations. Children's skin is especially sensitive and it's important to moisturize and protect their skin whenever they go outdoors in the winter.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 14</b>" +
                    "Visit your doctor or dermatologist if your skin becomes severely damaged. Besides skin becoming painful, unsightly and uncomfortable, broken skin invites infection.\n" +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Summer Skin Care</h1>" +n+
                    "<h4></h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Understand how the summer sun impacts your skin. It's important to know how the sun's rays impact your skin, especially when you're seeking to cut through the hype on cosmetic labels. The following basics should assist your understanding:\n" +
                    "Ultraviolet A (UVA): The longest wavelength of the sun, this one penetrates the dermis, your skin's deepest layer. Sun damage can activate free radicals and promote skin aging.\n" +
                    "Ultraviolet B (UVB): This wavelength penetrates the skin's upper layer, the epidermis. These rays cause sunburn, allergic reactions and skin cancers. After six times of being burned, the skin has double the risk of developing a fatal melanoma.\n" +
                    "Ultraviolet C (UVC): Generally these rays are filtered by the ozone layer and they're the most damaging rays.\n" +
                    "Scratch Test (ST): Sometimes if you scratch your skin with a back of your heel, the test will reveal your sensitivity.\n" +
                    "Infra-red (IR): This is the \"heat\" from the sun and too much can negatively impact collagen, elastic and your immune system." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Wear sunscreen but only after assessing the need and doing your own research. Not all sunscreens are made alike – some provide a physical barrier (minerals) while others provide a chemical barrier that absorbs ultraviolet rays. SPF stands for \"sun protection factor\" and indicates the length of time you can stay in the sun; you calculate the SPF by the number of minutes you can stay in the sun without burning normally.[3] (For example, if your skin turns red after 10 minutes in the sun, a sunscreen with SPF of 15 should allow you to spend 150 minutes in the sun.) However, concerns have peaked about what is in your sunscreen and just how effective sunscreens really are. Many sunscreens penetrate the skin and add to the chemical overload that your body is already subjected to with daily modern living.[4] There is no consensus that sunscreens work and there is no proof that higher SPF sunscreens are any better than lower level SPF and they may simply contain more chemicals, thereby increasing your exposure. And getting a false sense of security about your ability to stay in the sun all day because you're wearing sunscreen is unhelpful and can result in damaged skin – indeed, some scientists worry that this false sense of security coupled with inferior UVA focused sunscreen use has actually promoted skin cancers in recent times. Thus, \"how\" you treat sunscreen as a skin protectant is not very important – sunscreen should be used only as one part of your approach to guarding your skin during the summer; it cannot be the only method and it isn't foolproof.\n" +
                    "If sunscreens trigger sensitivities, breakouts and other skin problems for you, switch from chemical sunscreens to mineral sunblocks (zinc oxide and titanium dioxide) to see if this improves things for you.[5][6]\n" +
                    "If you have oily skin, don't use an SPF higher than 20; doing so risks overloading your skin with chemicals and more oil.[7] (Indeed, it's recommended that whatever your skin, you think twice about high SPF values on sunscreen products.)Special sunscreens are formulated for oily skin. Look at sunscreen packages carefully and see if they are labeled \"Oil-Free\" or \"Non-Comedogenic\" so they won't clog pores or cause excess oil.\n" +
                    "Unfortunately it isn't as simple as walking into your local drugstore and choosing a sunscreen you like the smell of or the price they're sold at. You do need to do some online research on the chemicals each sunscreen contains and make an informed decision about the brand you choose. See the Environmental Working Group's Skin Deep Cosmetics Database for information about each sunscreen on the market. It is at: http://www.ewg.org/skindeep/ and click on the tab that says \"sun\". At least you can make an informed decision by doing your own research here; don't trust the manufacturer's claims alone." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Stay out of the sun between the hours of 10am and 3pm. The hottest part of the day during the summer is the most damaging time. Don't stay out in the sun for long periods of time around the hottest hours; the longer you're outside, the longer your skin is exposed to the radiation. Get your exercise and activities done in the earlier, cooler hours, or in the later, cooler hours of the day.\n" +
                    "Note that some latitudes advise staying out of the sun between 11am and 4pm. Know what is advised for you particular location and err on the side of being cautious either side as well as during the hours suggested." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "\n" +
                    "Wear protective clothing over your skin. A lot of clothing in outdoor stores and fashion stores has a UV protection rating and some clothes are impregnated with a UV-absorbing colorless dye.[8] The UV protection rating is a good indicator of how clothing can act as an excellent barrier against the sun's rays. Cover up as much skin as you can, using lightweight fabrics when it's really hot and uncomfortable. Choose fabrics that won't itch, scratch, or overheat you and prefer light colors over dark ones, to keep the heat level down.\n" +
                    "Wear a hat. Your facial skin will benefit enormously from a permanent ring of shade over it in the heat of the sun.\n" +
                    "Wear sunglasses to protect your sensitive eye skin (and eyes). Eyes are prone to melanomas and cataracts, and the sensitive skin around your eyes is prone to fast aging." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Ditch the obsession with a tan. Sunbathing or using a solarium increases your chances of damaging your skin and getting skin cancers. Moreover, sunbathing will add a good 20 years to your age by dehydrating and wrinkling your skin. Do you really want that?\n" +
                    "Be careful with fake tan; these products contain a lot of chemicals that aren't necessarily good for your skin or your whole health. Again, check the EWG Skin Deep website to see how they rate the various products.\n" +
                    "Black skin is vulnerable to sun damage too; Iman says that she is two shades darker during summer than in winter and says that even though you may not be able to see the damage, it is still there." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Give your skin a break. By watching the weather over summer, you can work out the days when you won't need to slather on the chemicals, such as when it's pouring with rain or it's a very overcast day. Be sure to pop on your hat and cover clothing as usual because UV rays still penetrate the clouds; you can at least allow your skin a break from the sunscreen.\n" +
                    "If you're going on holiday and you're driving, then take your makeup off before you leave as it gives your skin time to breathe.\n" +
                    "Leave your makeup off as often as possible while on vacation. This is a great opportunity to let your skin breathe and be free from the chemicals in cosmetics." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Rinse skin after swimming. This is especially important when you've been swimming in chlorinated environments as the chlorine can dry out your skin and for some people it can even result in an allergic reaction. Besides, it's a lot nicer to smell neutral rather than of chlorine!" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 8</b>" +
                    "Avoid spraying perfume on your skin in the sun. The psoralen in perfume (especially in citrus perfumes) can permanently stain your skin when they react with the sun. During the summertime, it is recommended that you spritz your clothes with your fragrance rather than your skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 9</b>" +
                    "Drink plenty of water. Hydrated skin is better skin and it's easy for skin to become parched during the summer months. Dehydration results in dry skin, frown-lines, spots, a sluggish complexion and a lack of \"glow\". Drink water regularly throughout the day, preferably between meals (drinking during meals can dilute the nutrients from food). Water will both hydrate your skin and flush out toxins that can mar your complexion." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 10</b>" +
                    "Eat healthy foods. A healthy skin comes from eating well and summer is the ideal time to make dietary changes for the better. Cut down on sugar and refined processed foods which create unbalanced blood sugar levels and therefore contribute to premature aging. Eat plenty of fruits and vegetables, in salads, steamed, raw, or as part of a recipe dish. Choose from the rainbow of fruit and vegetable colors to ensure that you're getting all the antioxidants and nutrients your skin needs. A diet rich in flavonoids will help to ensure a healthy and glowing skin.[20] And include whole grains in your daily diet too, including the ancient grains.\n" +
                    "Yogurt is a healthy addition to your diet; just be sure it's sugar free and natural.\n" +
                    "No-fat or low-fat diets will cause your skin to dry, wrinkle and age. You need essential fats in your diet to keep your skin moist and supple. The answer is to exclude unhealthy fats (hydrogenated, trans fats, and heat or light damaged fats) from your diet but to keep using healthy fats daily. Nuts and seeds and fresh fish are excellent sources of good fats." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 11</b>" +
                    "Examine your skin regularly. At least one a month, perform a \"mole patrol\" to check for signs of sun damage on your skin. Be especially alert to moles that have changed shape or size or that hurt, itch, or bleed.\n" +
                    "For more instructions, see How to Examine a Mole." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Oily Skin</h1>" +n+
                    "<h4>Treating Oily Skin with Topical Products</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Use a gentle facial cleanser twice a day. Most dermatologists agree that cleansing the skin is the best way to reduce oil. Make sure to use a gentle, pH balanced cleanser rather than regular soap. Most soaps are highly alkaline and strip the natural acid mantle from the skin leaving it vulnerable to bacteria.\n" +
                    "Products containing benzoyl peroxide, salicylic acid, glycolic acid, or beta-hydroxy acid are often considered best. These are slightly acidic, however, so start off with only a small amount to make sure your skin doesn't have an adverse reaction.\n" +
                    "When washing your face, make sure you use warm water, not hot. Hot water can further irritate the skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Use a toner free of alcohol or acetone. Place a few drops on a clean, natural cotton pad and wipe it gently over the affected area. Toners can be harsh on skin, so dermatologists often recommend only using them on oily parts of your face rather than the whole face." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Moisturize your skin. While it may seem counterproductive, oil and moisture are two different things. Even oily skin can be dehydrated and requires moisturizer to stay healthy. Make sure to use a light, oil-free moisturizer." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Use blotting papers. This is a quick, effective solution to soak up excess oil. They won't cut down on your skin's oil production though, so this treatment should be paired with a cleansing regimen for the best results.\n" +
                    "Make sure you don't rub your skin with blotting papers. This can spread dirt and cause irritation. Instead, just gently press the paper down on your skin and hold it there for 15 to 20 seconds." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Use a clay mask. Masks help draw out dirt and oil, keeping pores clean. These products can also dry out the skin, however, so make sure you don't overuse them. Once a week should be the maximum usage." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Apply an oil-free, mineral powder makeup base for the daytime. Use powder blush rather than cream blush and powder eye shadows rather than cream eye shadows. A dusting of a translucent powder can be applied two or three times during the day after blotting the face with a tissue to remove any excess oil.\n" +
                    "</p>" +
                    "" +n+n+
                    "<h4>Avoiding Triggers</h4>" +n+
                    ""+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Avoid harsh soaps and creams. Any products containing alcohol or other harsh chemicals can irritate your face. This irritation could lead to more oil production and make the problem worse." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Avoid over-washing your face. Though you may think that the more you wash your face the better, this is not the case. Like with harsh chemicals, excessive washing will lead to irritation and can make your symptoms worse. You should wash your face no more than two times daily." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Stop using heavy cosmetics. These products can clog your pores, which will trap oil and dirt in the skin and make acne symptoms worse." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Change any towels or pads you use on your face every day. Oil, dirt, and bacteria get trapped on these products and you can then spread them all over your face." +
                    "</p>" +
                    "" +n+n+
                    "<h4>Treating Oily Skin with Home Remedies</h4>" +n+
                    ""+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Apply aloe vera to your face. The aloe vera plant has many therapeutic properties, including treating burns, cuts, and infections. It is also effective on oily skin and acne.\n" +
                    "Cut an aloe leaf in half and squeeze out the gel.\n" +
                    "Apply the gel evenly over your face.\n" +
                    "Allow the gel to dry. After it dries, rinse it off with cool water.\n" +
                    "This can be repeated two or three times a day." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Apply yogurt to your face. Yogurt helps open up pores, exfoliate the skin, and absorb excess oil.\n" +
                    "Take one tablespoon of plain yogurt and spread it evenly over your face.\n" +
                    "Leave the yogurt on for 15 minutes, then rinse off with cold water.\n" +
                    "Repeat once a day." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Rub cucumbers on your face. Cucumbers are often applied during facials and spa treatments because of their soothing properties. They contain vitamins and minerals that can help fight swelling, redness, and excess oil.\n" +
                    "Slice up a fresh cucumber and rub the slices on your face.\n" +
                    "Leave this on your face overnight, rinsing with warm water in the morning.\n" +
                    "Repeat daily." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Dry Skin</h1>" +n+
                    "<h4>Moisturizing from the Outside</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Moisturize frequently and consistently. The need to moisturize your skin when it's dry may seem like a no-brainer, but it's important that you know how to moisturize effectively. For instance, piling on an inch-thick layer of moisturizer once a week isn't going to do your skin much good. You need to be moisturizing frequently and consistently in order to effectively combat dry skin.\n" +
                    "Keep a facial moisturizer beside your bed. This will make it easier to remember to moisturize every night before you go to sleep. Make it a part of your nightly routine.\n" +
                    "If you suffer from dry hands, keep a small tube of hand cream in your hand bag or beside your sink. Use every time you wash your hands." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Moisturize when your skin is damp. Moisturizing when your skin is still slightly wet helps to seal in more hydration.[1] After you wash your face, pat off the excess moisture with a towel before applying your moisturizer. For your body, do the same thing. Pat your skin with a towel until it's just slightly damp, then apply a good moisturizer. Allow your skin to dry naturally so it can absorb all the moisture.\n" +
                    "If you're skin still feels dry, apply a second layer of moisturizer once the first layer has soaked in." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Change your products. You may need to change the products you use, according to changes in your skin or the time of year. In colder months, you may to switch to a richer moisturizer. In summer, you should use one with an SPF. If you have combination skin, it may be necessary to use a lighter moisturizer on the parts of your skin that gets oily (like your t-zone) and a heavier one where your skin gets dry." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Choose the right cleansers. Be careful when choosing a facial or body cleanser, as some cleansers can strip moisture from the skin. Opt for a gentle cream or milk cleanser that will moisturize the skin as it cleanses. Also try to stay away from heavily-fragranced cleansers as the chemicals behind scents can be drying." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Exfoliate gently. Exfoliating can be great for sloughing off dead skin cells and for smoothing the skin. However, many facial scrubs can also strip the skin of moisture and irritate dry skin. This is why it is important to exfoliate gently, using the right products and techniques.\n" +
                    "The ingredients in many facial scrubs can strip the skin of essential moisture. Instead of a facial scrub, use a damp baby's washcloth to massage your face in small, circular motions in order to gently, yet effectively exfoliate.\n" +
                    "Get rid of gritty, abrasive body scrubs and try using a loofah, exfoliating gloves or a dry skin brush to gently exfoliate the skin.\n" +
                    "Always moisturize your skin directly after exfoliating." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Limit the use of \"treatment\" products. A lot of times, dry skin is a side effect of using certain treatments, like ones for acne and wrinkles. If you are trying to clear your skin or fight off aging, this doesn't mean you have to stop using those treatments completely. It simply means you should use them less frequently because certain active ingredients in such treatments can exacerbate dry skin, especially in the winter." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Relieve itchy skin. Dry skin often leads to itchy skin, but scratching can make dry skin worse, and even damage the skin. Sometimes moisturizing alone will help to ease any dry-skin related itchiness, but if you need some extra relief, try a hydrocortisone cream or over-the-counter anti-itch lotion." +
                    "</p>" +
                    "" +n+n+
                    "<h4>Hydrating from the Inside</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Drink lots of water. Water flushes toxins from your system and carries nutrients to your cells. This helps to prevent dry skin by keeping your skin nourished and hydrated. You should aim to drink at least two liters of water per day.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Eat fresh fruit and vegetables. A healthy and balanced diet will help your skin by providing the vitamins and nutrients that the body needs to stay healthy and hydrated. Try to eat at least 2 portions of green, leafy vegetables and 2 portions of seasonal fruits daily. Fruit and veg with a high-water content, such as watermelon, broccoli and tomatoes, are especially good for hydration." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Eat healthy fats. Eating foods containing the good types of fat contributes to the body's overall health - increasing blood flow and the delivery of nutrients to all the body's cells, including skin. Try to eat more foods containing monounsaturated fat, such as avocados, olives and peanut butter, and more foods containing polyunsaturated fats, such as salmon, walnuts and tofu." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Take supplements. Taking supplements is an easy and effective way to increase your intake of key nutrients and vitamins, which help to promote healthy and hydrated skin. Try taking a fish oil supplement, which is great for dry skin and eyes, or increase your intake of vitamin E, an antioxidant which repairs and protects skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Cut back on salty and fried foods. Salty and fried foods will dehydrate the body, exacerbating dry skin problems. Limit your intake of these foods as much as possible to avoid dehydration and benefit your overall health.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Don't smoke. The negative side effects of smoking are well-documented, but you may not know that smoking is also bad for the skin. The tar contained in cigarettes clogs the pores, leading to blackheads and breakouts. Smoking hampers your breathing ability which inhibits circulation and deprives the skin cells of oxygen. Smoking also depletes the tissues of vitamin C, which is essential for healthy-looking skin.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Limit alcohol intake. Alcohol dehydrates the body, thus dehydrating the skin. It decreases the body's ability to absorb fluids, leading to a loss of water, electrolytes and minerals. This causes dry, red, easily irritated skin. Try to drink alcohol in moderation, and when you are drinking, have a glass of water between drinks." +
                    "</p>" +
                    "" +n+n+
                    "<h4>Preventing Dry Skin</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Avoid excessive bathing. Do not shower or wash your face too much, as this will dry out your skin. In order to avoid dryness, you should limit your bathing to just one bath or shower a day. You should also avoid steaming your skin and washing with water that is too hot.\n" +
                    "Use warm or lukewarm water so hydration isn't stripped from your skin. Water that's too hot tends to wash away your skin's protective lipid barrier.\n" +
                    "For the same reason, you should also avoid taking long showers or baths." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Moisturize all year round. This may be obvious to some people, but not so much to others. By moisturizing all year round, your skin will be prepared for whatever the seasons throw at it, whether it's biting winter winds or scorching summer heat.\n" +
                    "People with sensitive skin should avoid creams containing fragrances or lanolin as these can cause the skin to react negatively.\n" +
                    "Try to get your hands on products that contain either glycerin or hyaluronic acid, as both of these substances are fantastically hydrating for the skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Wear sunscreen. If you spend a lot of time outdoors, it's imperative that you protect your face with a cream or moisturizer that contains an SPF of 15 or higher. This will protect the sensitive skin on your face from damaging sun rays, which cause burns, sun spots and even wrinkles. Remember that you can burn your skin all year round, so sunscreen isn't just for summer!" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Use a humidifier. If the air in your house is very dry, your skin could be drying out as you sleep, leaving it feeling rough and flaky come morning. To counteract this effect, try putting a humidifier in your bedroom which you can turn on while you sleep.\n" +
                    "Putting a bowl or pot of water next to the radiator in your bedroom is a low-cost, DIY alternative to using a humidifier.\n" +
                    "Alternatively, try using a natural plant humidifier, such as a Boston palm, a bamboo fern, or a Ficus alii. These plants raise the level of water vapor in the air through transpiration - so try putting one in your bedroom, it'll help your skin while giving your bedroom a tropical feel!" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Cover up. Protect your skin from the elements by covering up as much as possible. In winter, protect your skin from drying winds by wearing hats, scarves and gloves. Wear a protective chapstick to shield your lips. In summer, wear a baseball cap or sunhat to protect your face from harsh rays of sun, and wear loose, light, long-sleeved shirts and pants to prevent skin from burning.\n" +
                    "</p>" +
                    "" +n+n+
                    "<h4>Home Treatments</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Use petroleum jelly. The hydrating properties of petroleum jelly cannot be understated. Petroleum jelly is very emollient and actually forms a barrier that prevents moisture from evaporating from the surface of the skin.[1] It is also a cheap and cheerful option for treating dry skin on a budget.\n" +
                    "As petroleum jelly can be thick and sticky, it may be best to apply it at night. Try dampening your skin, putting on a layer of your regular moisturizer, then a applying a thin layer of petroleum jelly to seal everything in.\n" +
                    "You can also use petroleum jelly for dry hands and feet. Coat your hands and feet with a layer of petroleum jelly before bed. Cover them with cotton gloves and socks to promote absorption and prevent the jelly from rubbing off on your sheets. Your skin will be supple and moist in the morning." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Use avocado. Mash up one half of a fresh, ripe avocado, then add in a quarter cup of organic honey. Include a teaspoon of milk or yogurt, if desired. Smear this creamy skincare recipe on your face and neck. Finally, wash it off with cool water after 10 minutes for super-nourished skin. " +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Use banana. Banana can rejuvenate dry skin, making it soft and supple. Mash up half of a banana in a bowl and spread it onto your face and neck. After 5 to 10 minutes, you may rinse it off with lukewarm water. To increase the effectiveness of this facial mask, you can add a teaspoon of honey to the banana." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Use milk. Milk has been used as a hydrating beauty balm for a very long time - in fact, Queen Cleopatra used to bathe in it! If this seems a little extreme, try washing your face with milk to hydrate the skin and reduce blemishes. The best way to do this is by pouring a little whole fat milk into a cup, dipping a soft washcloth into it, then massaging the milk into your skin. The lactic acid gently cleanses the skin, while the high fat content is good for moisturization." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Use mayonnaise. Mayonnaise is considered excellent for dry skin. Apply a mixture of two tablespoons of mayonnaise, a tablespoon of lemon juice, and half a teaspoon of honey directly to your face and leave for about ten minutes. For best results, use this mayonnaise mask once a week." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Make a sugar scrub. You can make your own sugar scrub for exfoliating and hydrating dry skin using just half a cup of brown or white sugar and a splash of olive oil. If you like, you can also add a drop or two of a fragrant essential oil such as mint or vanilla extract, or a teaspoon of softening honey." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Use aloe vera. Aloe helps to rehydrate the skin and also naturally reduces redness and inflammation. To use, break off a leaf from an aloe vera plant and rub the clear, sticky sap all over your face. Leave it on for 15 minutes, then rinse off. For best results, apply an aloe mask once or twice a week. You can easily get an aloe vera plant at a nursery or home improvement store." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 8</b>" +
                    "Use oils. Natural oils such as olive oil, almond oil and coconut oil are all fantastic home remedies for dry and flaking skin. Simply apply a thin layer of the oil of your choice onto your skin, morning and night, for softer, smoother skin.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 9</b>" +
                    "Use an ice cube. Try rubbing an ice cube all over your face, this makes your blood circulate round your face more, and brings moisture to the surface. Great for getting rid of dry skin and having a glowing face!\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 10</b>" +
                    "Use glycerine. Take few drops of glycerine and apply it all around your face and neck. Leave it on your face for 20 minutes, then wash it off with lukewarm water. You'll get a glowing and supple face.\n" +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Natural Moisturizer</h1>" +n+
                    "<h4>Ingredients</h4>" +n+
                    n+"Shea Butter Based Moisturizer[1]\n" +
                    n+"½ cup (115 grams) shea butter\n" +
                    n+"2 tablespoons oil (ie: apricot seed, avocado, jojoba, or sweet almond oil)\n" +
                    n+"10 to 15 drops essential oil (choose 2 to 3 different kinds)\n" +
                    n+"Coconut Oil Based Moisturizer[2]\n" +
                    n+"½ cup (115 grams) coconut oil\n" +
                    n+"1 tablespoon (15 grams) cocoa butter\n" +
                    n+"2 tablespoons (30 milliliters) oil (ie: apricot seed, avocado, jojoba, or sweet almond oil)\n" +
                    n+"10 to 15 drops essential oil (choose 2 to 3 different kinds)\n" +
                    n+"Beeswax Based Moisturizer[3]\n" +
                    n+"½ cup (120 milliliters) sweet almond oil\n" +
                    n+"¼ cup (55 grams) coconut oil\n" +
                    n+"¼ cup (227 grams) beeswax\n" +
                    n+"2 tablespoons (30 grams) cocoa butter or shea butter (optional)\n" +
                    n+"1 teaspoon vitamin E oil (optional)\n" +
                    n+"10 to 15 drops essential oil (optional)\n" +
                    n+"Anti-Aging Moisturizer[4]\n" +
                    n+"3 tablespoons (45 grams) shea butter\n" +
                    n+"3 tablespoons (45 milliliters) apricot seed oil\n" +
                    n+"1 teaspoon vitamin E oil\n" +
                    n+"1 teaspoon aloe vera gel\n" +
                    n+"10 to 15 drops essential oil (Clary sage, helichrysum, and myrrh recommended)"+
                    "" +n+n+
                    "<h4>Making a Shea Butter Based Moisturizer</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Assemble a double boiler. Fill a saucepan with 1 to 2 inches (2.54 to 5.08 centimeters) of water and place a glass, heat-safe bowl on top. Make sure that the bottom of the bowl is not touching the surface of the water.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Melt ½ cup (115 grams) of shea butter in the double boiler over medium heat. Stir the shea butter occasionally to help it melt evenly. Unlike coconut oil, shea butter does not clog pores, making it ideal for sensitive skin or acne-prone skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Add 2 tablespoons (30 milliliters) of oil and stir with a whisk until combined. You can use just one type of oil, or you can use a combination of two different kinds. Consider using any of the following oils:\n" +
                    "Apricot seed\n" +
                    "Avocado\n" +
                    "Jojoba\n" +
                    "Sweet almond" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Refrigerate the mixture for 10 to 15 minutes. Take the bowl off of the saucepan, cover it with a sheet of plastic wrap, and place it into the fridge. Take it out when the mixture starts to harden and turn translucent, about 10 to 15 minutes. Don't let it harden completely." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Add in 10 to 15 drops of your desired essential oils. Choose 2 to 3 different types of essential oil, and add them to the bowl. You need 10 to 15 drops total, so play around with the different proportions. For example, you could have 5 drops of lavender essential oil, 3 drops of carrot seed oil, and 3 drops of Clary sage. Consider any of the following oils listed below:\n" +
                    "Carrot seed\n" +
                    "Clary sage\n" +
                    "Frankincense\n" +
                    "Lavender\n" +
                    "Myrrh\n" +
                    "Rosemary" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Blend the ingredients together using an electric mixer for about 1 minute. The cream is ready once it turns thick and creamy—like whipped cream. You can do this using a handheld mixer or a stand mixer. If you don't have a mixer, you can use a food processor fitted with whisk attachments.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Transfer the mixture into a glass jar using a rubber spatula and store it in a cool, dry place out of direct sunlight. Avoid using plastic, as it tends to leach chemicals overtime. The essential oils in the cream may also degrade the plastic overtime. Use the cream within 6 to 12 months." +
                    "</p>" +
                    "" +n+n+
                    "<h4>Making a Coconut Oil Based Moisturizer</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Assemble a double boiler. Fill a saucepan with 1 to 2 inches (2.54 to 5.08 centimeters) of water and place a glass, heat-safe bowl on top. Make sure that the bottom of the bowl does not touch the water.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Melt ½ cup (115 grams) of coconut oil and 1 tablespoon (15 grams) of cocoa butter in the double boiler over medium heat. Stir the two together with a whisk to help them melt evenly. Coconut oil and cocoa butter are both very moisturizing. Keep in mind, however, that coconut oil can clog pores, so it may not be recommended for those who suffer from acne, blackheads, or oily skin." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Remove the mixture from heat, let it cool, then whisk in 2 tablespoons (30 milliliters) of oil. You can use just one type of oil or a combination of two different types. Consider using any of the following oils:\n" +
                    "Apricot seed\n" +
                    "Avocado\n" +
                    "Jojoba\n" +
                    "Sweet almond" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Add in 10 to 15 drops of your desired essential oils. Choose 2 to 3 different types of essential oil, then add them to the bowl. You will need 10 to 15 drops total, so you can experiment with different combinations. For example, you could have 4 drops of carrot seed essential oil, 4 drops of Clary sage, and 4 drops of Myrrh. Consider any of the following oils listed below:\n" +
                    "Carrot seed\n" +
                    "Clary sage\n" +
                    "Frankincense\n" +
                    "Lavender\n" +
                    "Myrrh\n" +
                    "Rosemary" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Refrigerate the mixture for 1 hour. Cover the bowl with a sheet of plastic wrap and put it into the fridge. Leave it there for 1 hour so that it can harden and set. This will make it easier to whip later on." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Whisk the mixture until it is light and fluffy. Take the bowl out of the fridge, and whisk the mixture together. You can do it by hand with a whisk, but an electric mixer (either stand or handheld) will be much faster and easier. You can even use a food processor fitted with whisks.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Refrigerate the mixture for half an hour. This will set the mixture to its final consistency and make it more cream like." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 8</b>" +
                    "Use a rubber spatula to transfer the cream to a glass jar, and store it in a cool, dry place away from sunlight. Do not use a plastic jar. The plastic may leach chemicals into the cream over time; the essential oils may also degrade the plastic as well. Use the cream within 6 to 12 months.\n" +
                    "Coconut oil has a low melting point. If your cream starts to get too soft, store it in the fridge." +
                    "</p>" +
                    "" +n+n+
                    "<h4>Making a Beeswax Based Moisturizer</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Assemble a double boiler. Fill a saucepan with 1 to 2 inches (2.54 to 5.08 centimeters) of water and place it on the stove. Set a heat-safe glass bowl on top and make sure that the bottom of the bowl is not touching the water.\n" +
                    "This is a beeswax-based moisturizer, so it is best to use it on the body and not on the face." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Melt ¼ cup (227 grams) of beeswax in the double boiler over medium heat. Chop up the beeswax into smaller pieces first, then place it into the bowl. Turn the heat to medium, and wait until the wax starts to melt. Stir it occasionally with a spoon to help it melt faster. This will create the base for your moisturizer.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Whisk in ¼ cup (55 grams) of coconut oil. Keep stirring until the coconut oil melts and gets evenly mixed into the melted beeswax. Coconut oil is naturally moisturizing, but some people find that it clogs pores. If you tend to get a lot of blackheads or acne, you may wish to omit it or replace it with shea butter.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Add in some cocoa butter, shea butter, or vitamin E oil, if desired. Keep stirring these until they melt and combine with the beeswax mixture. All three are wonderful for the skin. They are not completely necessary, but they can take your moisturizer to the next level.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Remove the mixture from heat and stir in the sweet almond oil. Carefully lift the bowl off of the saucepan and set it down on your counter. Stir in the sweet almond oil. If you can't find any sweet almond oil, try any of the following:\n" +
                    "Apricot seed\n" +
                    "Avocado\n" +
                    "Jojoba" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Add 10 to 15 drops of your favorite essential oil, if desired. You can use just one type of essential oil or a combination of different types. If you wish to use more than one type of essential oil, make sure that you end up with 10 to 15 drops total. For example, you could use 5 drops of lavender essential oil, 3 drops of frankincense, and 3 drops of rosemary. All of the below essential oils are wonderful for the skin.\n" +
                    "Carrot seed\n" +
                    "Clary sage\n" +
                    "Frankincense\n" +
                    "Lavender\n" +
                    "Myrrh\n" +
                    "Rosemary" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +
                    "Pour the mixture into a glass jar. Avoid using a plastic jar, as the chemicals in the plastic may eventually leach into the moisturizer. The essential oils may also corrode the plastic as well." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 8</b>" +
                    "Wait for the moisturizer to cool before using it. Store it in a cool, dry place, out of reach of sunlight, and use it within 6 months.\n" +
                    "</p>" +
                    "" +n+n+
                    "<h4>Making an Anti-Aging Moisturizer</h4>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +
                    "Whip 3 tablespoons (45 grams) of shea butter in a bowl until it turns creamy. You can do this by hand using a whisk, but an electric mixer (such as a stand mixer or a handheld mixer) would be much faster. You can even use a food processor fitted with whisks.\n" +
                    "Shea butter is great for sensitive skin, because it doesn't clog pores. It also contains lots of anti-aging vitamins." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +
                    "Add 3 tablespoons (45 milliliters) of apricot seed oil. Apricot seed oil is especially good for sensitive skin because it is non-irritating and soothing. It also feels light and doesn't clog up pores. If you can't find any apricot seed oil, consider any of the following oils:\n" +
                    "Avocado\n" +
                    "Jojoba\n" +
                    "Sweet almond" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +
                    "Add in 1 teaspoon of both vitamin E oil and aloe vera gel. Vitamin E oil helps reduce signs of aging, such as wrinkles and lines. It also helps promote skin growth and regeneration. Aloe vera gel is cool and soothing, making it idea for reducing acne and inflammation.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +
                    "Add in your essential oils. You will need 3 drops of Clary sage, 5 drops of myrrh, and 5 drops of helichrysum. All three oils have anti-aging benefits and help reduce the appearance of wrinkles and lines. If you can't find these oils anywhere, or if you simply don't like them, consider any of the following anti-aging oils:\n" +
                    "Carrot seed\n" +
                    "Frankincense\n" +
                    "Geranium\n" +
                    "Patchouli\n" +
                    "Sandalwood" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +
                    "Beat the ingredients together with a whisk, then transfer it to a glass jar. Once you have all of the ingredients in your bowl, beat them together with a whisk until all of the oils, butters, and gels are evenly mixed together. Transfer the mixture into a glass jar using a rubber spatula.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +
                    "Store the moisturizer in a cool, dry place away from sunlight. Use it within 6 to 12 months.\n" +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    ""
    };



    private String imgFoodTips[] = {
            "foodtip1",
            "foodtip2",
            "foodtip3"
    };

    private String txtFoodTips[] = {
            "<h1>Choosing a Healthy Diet</h1>"+n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Choose the right carbohydrates. Simple carbs, like sugar and flour, are quickly absorbed by the body's digestive system. This causes a kind of carb overload, and your body releases huge amounts of insulin, to combat the overload. Eat these in moderation. Complex carbs, on the other hand, are slowly digested by the body. They include whole-grain flour, hearty vegetables, oats, and unprocessed grains, like brown rice. These foods are usually higher in vitamins and other nutrients that are beneficial for the body, and they are higher in fiber (which keeps your digestive system running smoothly).\n" +
                    "Consider eating leafy greens like kale, collard greens, mustard greens, and Swiss chard. They are packed with nutrients and will fill you up very quickly. Create a simple sauté with olive oil, garlic, a little salt and pepper, which will be surprisingly tasty meal as well as a nutritious one." +
                    "Choose wheat (brown) bread instead of white bread and whole wheat pasta instead of \"normal\" pasta. Processed carbohydrates, such as those found in white bread are harder to draw nutrients from, and therefore constitute empty calories. Plain oatmeal is also very healthy for you." +
                    "" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Eat lean, mean protein. Aim to get between 10% and 35% of your daily calories from protein. Protein helps you to build muscle and gives you the lasting energy throughout the day. Some examples of healthy proteins include:\n" +
                    "Lean fish such as flounder, sole, cod, bass, perch, and halibut." +
                    "Lean poultry such as chicken or duck breast." +
                    "Legumes like beans and soy products (e.g. edamame and tofu)." +
                    "Nuts like cashews." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Know the difference between good fat and bad fat. You need to consume fat for your body to function correctly. However, it's important to choose the right kind of fats. Here's a quick primer.\n" +
                    "Monounsaturated fats and omega-3 fatty acids are good fats, which you should try to consume regularly. They help lower the \"bad cholesterol\" in your body by raising \"good cholesterol\". Foods that are high in fatty acids are olive oil, nuts, fish oil, and various seed oils. Adding these \"good\" fats to your weekly diet can lower your cholesterol and reduce your risk of heart disease.\n" +
                    "Avoid trans fats and saturated fats. Trans fats are a form of unsaturated fat commonly found in processed foods, and consuming them raises your risk of heart disease. Read the labels of what you eat, and look for \"hydrogenated\" anything on the ingredient list." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Stock up on superfoods. So-called superfoods may have a misleading title, but some truly are cut above. Superfoods may have the ability to fight heart disease, stave off cancer, lower cholesterol, and even boost your mood. Here are just few of them:\n" +
                    "Blueberries. Blueberries may facilitate brain health. If you don't have access to blueberries, then try fresh berries, raspberries, or cranberries.\n" +
                    "Algae. It may not sound appetizing, but when you read the list of health benefits you may think again. It is rich in vitamins, minerals, and amino acids, as well as beneficial in managing natural flora in the gut.\n" +
                    "Salmon. Another creature of the sea makes the list, and for good reason. Salmon is rich in omega-3 fatty acids, a good type of fat. Omega-3 fats are good for blood pressure, brain function, and heart health.\n" +
                    "Cranberries. These red berries contain quercetin, a natural antioxidant, are low in sugar and are a good source of Vitamin C which is used for the growth and repair of tissue all over the body." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Watch your salt intake. Although humans need salt in moderation, too much salt can lead to high blood pressure, osteoporosis, and osteoporosis. Use salt sparingly, and always check labels for salt content.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Practice moderation. Don't over-consume any one food or type of food. Instead, try to vary your diet so that you eat a little bit of everything in a moderate amount.\n" +
                    "Some people might be great at giving up meat, sugar, alcohol, or other foods. However, most of us are likely to give it up for awhile, then break down and binge. Avoid this deprivation-binge cycle by allowing yourself to have small \"cheats\". For instance, if you want to eat less sugar, allow yourself to eat one dessert each Friday night and abstain for the rest of the week. Having a break to look forward, which can help your will power through the other days." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Making Easy but Healthy Decisions</h1>"+n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "\n" +
                    "Drink plenty of water. Staying hydrated with basic H2O is an easy and dramatic way to improve your health. Drinking enough water can also help with weight loss by keeping your stomach feeling full. Drink water before, during and after a meal to aid digestion.\n" +
                    "If you feel like snacking, try drinking a full glass of water first. If you're still hungry 15 minutes after your drink, then it's time for a snack.\n" +
                    "Carry water with you so you can easily pick it up when you're thirsty." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Avoid sugary drinks. These include soft drinks, juices, sports and energy drinks, as well as other products containing artificial sweeteners. Giving up sugary drinks is one of the easiest ways you can instantly improve your diet and become healthier. A white chocolate crème frappuccino has whopping 500 calories. While it's okay to treat yourself with these and other drinks every once in a while, it's not a good idea to make them a regular part of your diet.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Consider participating in Meatless Mondays. Meatless Monday is an international campaign that encourages people to give up eating meat one day per week. Eating less meat can have several health benefits, as most people already have enough protein in their diets.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Stay away from fast food. As we all know fast food is bad for our health, yet it continues to remain a weekly staple for too many people. For one, fast food is often fried, processed, and excessively salty. Add soft drinks and fries and your meal could easily burn through half of your suggested caloric intake for the day. To add insult to injury, much of the fat contained in fast food is trans fat, the worst kind of fat." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Reduce your alcohol intake. Excessive alcohol consumption makes you gain weight and is hard for the liver to process leading to a host of preventable diseases. Drinking in moderation is key, if you do consume alcohol, consider drink a glass of wine or beer with your meal as opposed to multiple drinks at a bar.\n" +
                    "Red wine, in particular, contains polyphenol, called resveratrol that scientists believe is particularly heart-healthy. Resveratrol improves the function of blood vessels in the heart and curbs the amount of \"bad\" cholesterol in your body.\n" +
                    "Are you pregnant and worried about drinking? Doctors recommend expectant mothers to abstain from alcohol." +
                    "</p>" +
                    "" +n+n+
                    "",
            "<h1>Changing Your Mindset</h1>"+n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Adopt a healthy attitude towards food. Take a hard look at your eating habits. Do you eat more when you feel stressed?Do you withhold food from yourself in order to feel like you're in control? Try to evaluate whether you have an unhealthy emotional attachment to food. If you do, here are few steps to consider:\n" +
                    "Find a healthier replacement. If you find that you tend to gorge on unhealthy foods when you're stressed, find a substitute activity — for instance, you could instead go for a walk, take a long bath, or call a trusted friend for a chat. Whatever you choose, it should be something that helps you to decompress, so that you no longer feel the need to binge.\n" +
                    "See food as sustenance. A lot of Western culture is rife with messages that food is for entertainment or for relieving boredom. Break yourself of this cognitive habit by consciously evaluating food in terms of what it can do to keep your body healthy. Ask yourself if what you're about to put in your mouth is good for you, and if it will help your body function as it was designed to.\n" +
                    "Consult a medical professional. Eating disorders are classified as mental illnesses, and you can't always just talk yourself into stopping destructive behaviors.  If you suspect that you have an eating disorder (whether it's over- or under-eating), ask your general practitioner to refer you the appropriate care." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Determine how many calories your body needs to function each day. This number can vary widely, depending upon your metabolism and how physically active you are. As a rule, the more muscle mass you have, the more calories you need to consume and to function properly. Otherwise, your body will start breaking down muscle tissue for energy.\n" +
                    "If you're the kind of person who puts on 10 pounds just smelling a slice of pizza, then your daily caloric intake should stay around 2000 calories for men, and 1500 calories for women. Your body mass also plays a part in this — more calories are suitable for naturally bigger people, and fewer calories for smaller people.\n" +
                    "If you're the kind of person who can eat without putting on a pound, or you're physically active, you may want to increase your daily caloric intake by 1000-2000 calories, a little less for women." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "\n" +
                    "Don't skip breakfast. Many people do this because they think they can drop pound, or they just don't feel hungry in the morning. Although the scientific evidence is still inconclusive, there are several reasons why you might not want to skip what many people believe is the \"most important meal of the day\".\n" +
                    "Eating breakfast gets your metabolism going and keeps it active throughout the morning. This will keep you energized through out the morning.\n" +
                    "Skipping breakfast might leave you famished by lunch, causing you to binge as a way to compensate.\n" +
                    "A small breakfast is better than no breakfast. If you don't feel up to a full meal, at least drink some water and eat a piece of fruit, a granola bar, or a piece of toast. Get more nutritious bang for your buck by eating a breakfast smoothie.\n" +
                    "Avoid skipping breakfast at the day of an important exam, job interview, or other critical event, where you may be distracted by your hunger or not have enough energy for your brain to work to its full potential." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Eat slowly. Have you ever gorged on a huge meal and felt fine immediately after, but felt like exploding 15 minutes later? This happens because it takes some time for your stomach to tell your brain that it's full. Circumvent the problem by consuming your food slower. That way, by the time you get the message and start feeling satisfied, you haven't consumed extra food.\n" +
                    "\n" +
                    "Slow yourself down by waiting 5 or 10 minutes between each course. Chew each bite thoroughly" +
                    "Drink a full glass of water throughout your meal. Stopping for sips will slow your eating, as well as help you feel more full.\n" +
                    "Put your fork down between bites. This is a physical reminder to finish the food in your mouth before taking another bite." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Eat five times per day. You may consider eating three meals per day (breakfast, lunch and dinner), with two snacks in between. Doing this allows you to eat slightly less at your meals, giving your body a more manageable amount of food to digest, and keeps your blood sugar at a consistent level throughout the day." +
                    "</p>" +
                    "" +n+n+
                    "",
    };



    private String imgHandCare[] = {
            "handcare1",
            "handcare2",
            "handcare3",
            "handcare4",
            "handcare5"
    };

    private String txtHandCare[] = {
            "<h1>Keeping Your Hands Clean</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Wash with a moisturizing hand soap. It’s important to keep your hands clean, but using an antibacterial hand soap can dry out your skin. Instead, wash your hands with a moisturizing soap that contains hydrating ingredients, such as shea butter, olive oil, or aloe vera, to avoid stripping the natural oils from your skin.\n" +
                    "When you wash your hands, avoid using hot water, which can also dry out your skin. Wash with lukewarm water instead.\n" +
                    "Don't worry about washing your hands too much -- it's important to wash regularly to keep your hands as free of germs as possible. At the very least, you should wash your hand before you eat and after you use the bathroom. You should also wash after changing a diaper, interacting with animals, or any time that your hands appear dirty." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Clean under your nails with a nail brush. Even if you wash your hands regularly, there may be dirt and grime under your fingernails that doesn’t rinse away. While you’re washing your hands, use a good quality nail brush to gently scrub beneath your nails and remove any dirt that may be stuck there.\n" +
                    "When you use the brush, hold it in a downward direction so it’s perpendicular to your nails. Move it along the entire nail, scrubbing back and forth to remove the dirt and debris.\n" +
                    "After scrubbing your nails, rinse away the soap, water, and dirt as you normally would." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Keep your nails trim and well shaped. You'll have an easier time keeping your nails clean if you groom them properly. Use nail clippers to keep them at a length that you like, and file them with a crystal nail file or gentle emery board into a neat shape, such as a square or oval.\n" +
                    "It's also a good idea to use a cuticle remover and cuticle pusher to keep your cuticles neat. The cuticle is the thin hand of skin around your nail. The remover softens the skin, so you can easily push it back with a metal cuticle pusher or a wooden orange stick. Never cut your cuticles -- the skin may get infected." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Exfoliate your hands weekly. Use a hand scrub once a week to buff away the dry, rough skin and keep your hands soft and healthy. Wet your hands with lukewarm water, and massage a small amount of the scrub over both of your hands, working in circular motions. Rinse it off with warm water, and apply a hand cream.\n" +
                    "Wash your hands with the moisturizing soap before exfoliating.\n" +
                    "You can purchase hand scrubs at the drugstore, beauty supply store, and other stores that sell bath products.\n" +
                    "If you prefer, you can mix up your own all-natural hand scrub with ingredients from your kitchen. Combine equal parts of sugar and olive oil, and use it to scrub the dead skin from your hands." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Moisturizing Your Hands</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Apply hand cream regularly. To ensure that your hands stay soft, you should use a hand cream several times a day. Look for a formula that contains emollient ingredients, such as glycerin, shea butter, and natural oils. Massage the cream in after you wash your hands in the morning and before you go to bed at night. If your hands start to feel dry at any point during the day, reapply then as well.\n" +
                    "If you’re worried about your hands being greasy, look for a hand cream that’s designed to be fast-absorbing. It will sink into your skin quickly without leaving any residue behind that might may your hands feel slippery.\n" +
                    "The skin on men’s hands tends to be thicker, oilier, and hairier, so you may want to purchase a cream designed specifically for male skin. It usually has a richer texture, and doesn’t contain any fragrance." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Use vitamin E oil to moisturize your nails. While you should rub your hand cream over your nails to keep them moisturized, it’s also important to target them directly with more intensive treatments. To keep your cuticles healthy, apply a vitamin E oil to the skin around your nails each night before you go to bed. That will help prevent the skin from becoming cracked and painful.\n" +
                    "You can also purchase a cream specifically for the cuticles that can help moisturize and protect the area.\n" +
                    "Both men and women should take the time to moisturize their nails and cuticles. Whether or not you get regular manicures, neglecting your cuticles can lead to painful hangnails." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Treat cracks on your hands with an ointment. When your hands become extremely dry, the skin may actually crack and split. To treat this painful type of dry skin, you need more intensive moisture than a regular hand cream can provide. Reach for a rich ointment instead -- it will deliver moisture and create a barrier over your skin that helps protect and heal.\n" +
                    "If you don’t have a specific ointment for your hands, petroleum jelly works just as well." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Treat your hands with a mask weekly. Even if you moisturize your hands daily, they may not get all the moisture that they need. Use a hand mask once a week to deliver a super dose of hydration that keeps the skin on your hands soft and healthy. Apply it to clean, dry hands, and allow it to sit for the specified time on the packaging. Wash it off with warm water, and follow up with a hand cream to lock in the moisture.\n" +
                    "You can purchase hand masks at drugstores, beauty supply stores, and other stores that specialize in skincare products.\n" +
                    "You can also make a moisturizing hand mask at home with leftover avocado. Mix ½ an avocado with 1 egg white, and apply it to your hands. Allow it to sit on your skin for 20 minutes before rinsing it off." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Protecting Your Hands</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Use sunscreen on your hands. Just like the rest of your skin, your hands are vulnerable to damage from the sun, including dark spots that can make them look older. To protect your hands from the sun, apply a broad-spectrum sunscreen with a SPF of 30 or higher everyday.\n" +
                    "Be sure to reapply your sunscreen throughout the day, particularly after you’ve washed your hands.\n" +
                    "If you want to streamline your skin care routine, use a hand cream that has SPF of 30 or higher built into it." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Wear gloves when doing chores. Plenty of the tasks that you have to do around the house can do damage to your hands. Whether you’re washing dishes, doing yard work, or working with tools, always put on a pair of protective gloves first. That will keep your hands from getting dry, cracked, and callused.\n" +
                    "For chores that require submerging your hands in water, plastic or rubber gloves are the best option.\n" +
                    "For light yard work and gardening, cloth gloves are usually effective in protecting your hands from dirty and grime.\n" +
                    "For difficult manual labor, such as working with heavy tools, suede or leather work gloves usually offer the most protection for your hands.\n" +
                    "You should also wear gloves to protect your hands from cold weather, which can dry out your hands too. Knit and leather gloves can both work well, but look for a pair with an insulated lining in material such as fleece to provide the most warmth." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Apply a retinol treatment to dark spots. If your hands have developed dark spots or other discolorations, the best treatment is some type of retinol cream. Retinol helps stimulate the production of new skin cells, so it works well to fade dark spots. Apply a retinol-based cream to your hands before bed to keep your hands clear and smooth.\n" +
                    "Retinol products make your skin more vulnerable to irritation from the sun, so be sure to use a sunscreen in conjunction with your retinol cream and apply the cream only at night." +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Taking Care Of Nails</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Gather up all of the things you need and place them near the sink, just in case you spill something." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Soak a cotton ball with nail polish remover. Remove all the leftover polish with this. If you don't have any nail polish on right now, please proceed on with the next step.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Take the bowl of sudsy water and soak your fingers for 5 minutes.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "When you are done, take one of the washcloths (see Things You'll Need) and gently push back your cuticles.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Get the nail cutters and shape your nails into a U-shape. Cut off any hangnails.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Soak your nails in the lemon juice (Things You'll Need) for about 5 minutes. This cure will make your fingernails healthy.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Apply the lotion onto your hands and then take the two washcloths and cover your hands with them for 7 minutes. They should feel soft and refreshed afterwards.\n" +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 8</b>" +n+
                    "Buff your nails or polish them.\n" +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>DarkElbows Treatment</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Use lemon juice. Lemon juice contains citric acid which is a natural bleaching agent. Therefore, applying lemon juice to elbows can help to lighten the skin. To use:\n" +
                    "Cut a large lemon in half. Squeeze out some of the juice from both halves so that you have two hollow halves or \"cups\". Rub each lemon cup over your elbows.\n" +
                    "You can rub away any excess pulp, but don't wash your elbows for about 3 hours. This gives the lemon juice time to act more deeply.\n" +
                    "Wash off the lemon juice with some warm water. As lemon juice can be drying, you should moisturize the area with your favorite body moisturizer.\n" +
                    "Repeat this every day until the dark skin begins to fade. You should see a significant difference within a couple of weeks." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply heavy cream and turmeric. A mixture of heavy cream and turmeric works well to lighten the skin on elbows, particularly on people with darker skin tones. Turmeric is a natural bleaching agent which helps to reduce melanin in the skin.\n" +
                    "Get some heavy cream (or milk with a high fat content) and boil it until it thickens and becomes clotted.\n" +
                    "Mix in a half teaspoon of turmeric, with a half cup of gram-flour and blend into a paste.\n" +
                    "Apply this paste to your elbows (and knees), using a circular motion, then rinse well with water.\n" +
                    "Be aware that turmeric can dye the skin a yellowish-orange color, but this will fade after a day or two." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Make a paste using milk and baking soda. This remedy helps to lighten elbows as milk contains lactic acid which reduces skin pigmentation, while the baking soda helps to exfoliate dead skin cells.\n" +
                    "Mix enough milk to turn the baking soda in to a paste.\n" +
                    "Apply on your elbows and gently scrub it in a circular motion. Do this until you notice your skin is lighter." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Try mixing yogurt and vinegar. The combination contains both lactic and acetic acid each of which helps lighten your skin color.\n" +
                    "To use, combine one teaspoon of yogurt with one teaspoon of white vinegar and mix until they form a consistent paste.\n" +
                    "Apply to elbows, rubbing in a circular motion. Leave for 20 minutes, then rinse off and moisturize." +
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Mix lemon juice and yogurt in a cup. Use a brush to wipe off the dirt or sweat trapped in your elbow before applying this mixture. Use a spoon to add a small amount of water to the mixture. Use a brush or your hand to apply the mixture directly to the dark skin of your elbows. Wait for 10 to 20 minutes for the mixture to dry, then rinse well and wash with soap and water. Use a dry (and clean) cloth to dry, then moisturize the area.\n" +
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    ""
    };



    private String imgLegCare[] = {
            "legcare1",
            "legcare2",
            "legcare3",
            "legcare4"
    };

    private String txtLegCare[] = {
            "<h1>Preparing Your Skin</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Soak your legs. Whether in the bathtub or the shower, you should allow your skin and hair to soften before shaving; this will improve the closeness of your shave. Some people suggest soaking in the tub for 15–20 minutes, but according to others just three minutes in the shower is enough to do the trick.\n" +
                    "Try doing the rest of your bathing routine first—body cleansing, shampoo, and conditioner—then following with your shave at the end. This will allow maximum time for your skin to soften, regardless of whether you’re in the bath or shower."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Use lukewarm water. Hot water, though it might feel pleasant, dries out the skin and should be avoided. When showering or bathing, keep the water at a pleasant, moderate temperature.\n" +
                    "Ice cold water should also be avoided, as this is very shocking to the skin."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Exfoliate your skin. This is a crucial step that will keep dead skin cells from clogging your razor. It’s sometimes tempting to pass on exfoliating, but you really should put in the effort before every shave.\n" +
                    "Use a salt or sugar scrub from the store or online—you can find a great one at a variety of price points and in a variety of scents. Some good ones to try include Arbonne Awaken Sea Salt Scrub, Soap and Glory Flake Away Body Scrub, and St. Ives Smoothing Apricot Body Wash.\n" +
                    "You can easily make your own scrub at home. Try mixing together 1 1/4 cup of sugar, 1 1/2 cup of oil (olive, coconut, or baby oil work fine), and 3 tablespoons and lemon or lime juice.[3]\n" +
                    "Exfoliation is also great for helping with in-grown hairs, which can be unsightly and ruin your best efforts at getting great skin on your legs."+
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Removing Your Leg Hair</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Shave your legs gently. Use several soft upward strokes with a sharp razor instead of only a few firm ones. This way you’re less likely to cut yourself and you’ll be sure to get all of the little hairs.\n" +
                    "While it may seem easy to use body wash or soap since you’re using it on the rest of your body, these items will dry your skin. It’s best to use a product such as shaving cream or gel that is specifically formulated for the purpose of shaving your legs.[7] This will help you get the smooth, glowing skin you’re after.\n" +
                    "Pay careful attention to how your hair grows. You should be shaving against the grain, and may need to shave up or down in certain areas depending on the direction of the follicles, in order to best remove the hair."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Choose the right blade. Cheap blades won’t get you a close shave. If your hair is fine and thin, you should do fine with a 3- or 4-blade razor, but coarse, thicker hair demands one with 5 blades. It’s also a good idea to use a razor with a built-in lubricant strip if your skin is sensitive \n" +
                    "Replace your razor frequently, anytime you notice a dull or corroded blade or that you’re not getting a good shave anymore. This will also help you to avoid cuts and unsanitary conditions. Every three shaves is a good rule of thumb for replacing your razor."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Wax your hair. Waxing removes the root of the hair at the shaft, ensuring super smooth soft skin that lasts a lot longer than a shave does. You can wax at home with a kit from the drug store or you can get your legs waxed by a professional.\n" +
                    "Waxing does hurt when it’s being done (though the pain is brief), so it’s not necessarily the best choice for those with very sensitive skin or who are averse to unnecessary pain."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Use depilatory products. Depilatory creams, lotions, and sprays are chemical products that dissolve the hair on the surface of your skin. You can use these pain-free items in the shower or the bathtub, and they are formulated to remain in place on your skin until you wipe them away with a washcloth.\n" +
                    "Depilatory creams have traditionally been known for their strong odor, but newer versions aren’t nearly as offensive as their old-school counterparts. Some even have a tropical smell!\n" +
                    "Because you’re not pulling the hair out at the root, you’ll need to use depilatory creams, etc., more frequently than you would if you were waxing."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Get laser treatments. A more permanent solution for removing your leg hair is to get several (usually 3–5) laser treatments. These remove the hair from your legs by directing highly concentrated beams of light into the hair follicles.\n" +
                    "Laser hair removal is an expensive option, costing an average of $235 per session. Since it will take several sessions to see permanent results, it’s important to consider the overall cost when deciding on this route."+
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Moisturizing Your Skin</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Lotion right after you shave. As soon as you get out of the shower or bathtub, rub a thick lotion all over your legs. Try to do this while your legs are still a little bit wet (but not soaked), as the water will help lock in the moisture from the lotion.\n" +
                    "Only moisturize after you shave, never before. Moisturizing before you shave will clog the pores and keep you from reaching all of the hair with your razor.\n" +
                    "Avoid lotions that contain alpha-hydroxy or alcohol, as these products can irritate skin that has just been shaven.\n" +
                    "If your skin is particularly dry or prone to eczema, you may want to try a thicker cream as opposed to a lotion. Good options include CeraVe Moisturizing Cream and Cetaphil Moisturizing Cream, both of which are easy to find in stores and online."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Apply lotion frequently. Although post-shave is the most important time to apply lotion, you will want to moisturize daily, especially if you go several days in between shaves. Try to get into a habit of doing it at the same time every day (at night or while getting dressed in the morning, for example) so that you don’t forget.\n" +
                    "Although you want to moisturize frequently, don’t overdo it; too much lotion can lead to clogged pores. Once or twice a day is sufficient."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Try olive oil. Before going to bed at night, massage olive oil into your legs, wait for the skin to absorb it, then rinse in the shower. This will leave your legs feeling silky soft!"+
                    "</p>" +
                    "" +n+n+
                    "" +n+n+
                    "",
            "<h1>Treating the Heels Skin</h1>" +n+
                    "<p>" +
                    "<b>Step 1</b>" +n+
                    "Check for infections. You should start by checking for signs of infection. If the area is swollen, releasing pus or blood, or is very tender and painful, you should go immediately to your doctor or local health clinic. Skin cracks are very prone to infection and these infections require professional treatment.\n" +
                    "If you do not have health insurance (and you live in the US), go to the official listing of clinics for low income individuals. You should be able to find a clinic which will scale your bill to the amount of money you have available."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 2</b>" +n+
                    "Soak your skin with a disinfectant. Start treatment of basic cracks by soaking your skin. Sanitize a bowl, bucket, or tub and then fill it with warm (not hot) water. You'll then want to pour in a little apple cider vinegar to help disinfect your skin. Use about 1 cup per gallon of water. Disinfecting will help cut down on chances for the cracks to become infected."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 3</b>" +n+
                    "Gently exfoliate. Using a clean washcloth, gently rub the affected area. This will remove dead skin cells and allows the products you'll place on your skin to absorb better. Be sure to be gentle and that the washcloth you use is clean.\n" +
                    "Once you've healed the cracks, you can use more aggressive forms of exfoliating but this should not be done more than once a week. Your skin is sensitive and needs to be treated carefully."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 4</b>" +n+
                    "Apply a layer of moisturizer. Give your skin a final rinse and then apply a layer of moisturizer. You'll want to lock in the moisture that your skin received with the soak, or else you risk drying out your skin even more.\n" +
                    "We recommend a lanolin product but you'll find other recommendations in the next section."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 5</b>" +n+
                    "Apply wet dressings overnight. If you have time, such as if you can treat your skin overnight or on a weekend, wet dressings may help heal the skin and can at least provide you with greater comfort.[1] Wet dressings consist of a moist layer of fabric covered by a dry layer. So, for example, let's say your feet are cracked. Wet a pair of socks and then wring them so they don't drip. Put those on and then cover with dry socks. Sleep like this overnight.\n" +
                    "It is important not to do this if you suspect the cracks are infected, since this can make the infection worse."+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 6</b>" +n+
                    "Apply bandages during the day. For treatment during the day, fill the cracks with liquid or gel \"bandage\" product, or at least with an antibiotic product like Neosporin. You can then cover the area with a protective cotton surgical pad and wrap with gauze. This should reduce pain and speed up the healing process.\n"+
                    "</p>" +
                    "" +n+n+
                    "<p>" +
                    "<b>Step 7</b>" +n+
                    "Keep the area clean and protected until the cracks heal. Now you just have to be patient while the cracks heal. Be sure to keep the affected area clean and covered, to prevent further irritation. If the cracks are on your feet, wear socks which are clean and change them at least once (if not twice) a day until the cracks heal. If the cracks are on your hands, wear gloves when you're outside and for activities like washing dishes.\n"+
                    "</p>" +
                    "" +n+n+
                    ""
    };




    FullDataImgStore(String getSubName){
        this.getNameForFullDesp=getSubName;
    }
    ArrayList<GetFullDespDataImg> getFullDespDataImgs() {
        ArrayList<GetFullDespDataImg> readFullImgTxt = new ArrayList<>();
        GetFullDespDataImg dataFull;
        switch (getNameForFullDesp){
            case "Threading":
                for (int i=0;i<txtThreading.length;i++){
                    dataFull = new GetFullDespDataImg(imgThreading[i],txtThreading[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Waxing":
                for (int i=0;i<txtWaxing.length;i++){
                    dataFull = new GetFullDespDataImg(imgWaxing[i],txtWaxing[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Pedicure":
                for (int i=0;i<txtPedicure.length;i++){
                    dataFull = new GetFullDespDataImg(imgPedicure[i],txtPedicure[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Manicure":
                for (int i=0;i<txtManicure.length;i++){
                    dataFull = new GetFullDespDataImg(imgManicure[i],txtManicure[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Head Massage":
                for (int i=0;i<txtHeadMassage.length;i++){
                    dataFull = new GetFullDespDataImg(imgHeadMassage[i],txtHeadMassage[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Facial":
                for (int i=0;i<txtFacial.length;i++){
                    dataFull = new GetFullDespDataImg(imgFacial[i],txtFacial[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Basic Bridal Makeup":
                for (int i=0;i<txtBridalMakeup.length;i++){
                    dataFull = new GetFullDespDataImg(imgBridalMakeup[i],txtBridalMakeup[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Basic Hair Cut":
                for (int i=0;i<txtHairCut.length;i++){
                    dataFull = new GetFullDespDataImg(imgHairCut[i],txtHairCut[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Basic Hair Do's":
                for (int i=0;i<txtHairDo.length;i++){
                    dataFull = new GetFullDespDataImg(imgHairDo[i],txtHairDo[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Bindi Decoration":
                for (int i=0;i<txtBindiDec.length;i++){
                    dataFull = new GetFullDespDataImg(imgBindiDec[i],txtBindiDec[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Bleach":
                for (int i=0;i<txtBleach.length;i++){
                    dataFull = new GetFullDespDataImg(imgBleach[i],txtBleach[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Saree Drape":
                for (int i=0;i<txtSareeDrape.length;i++){
                    dataFull = new GetFullDespDataImg(imgSareeDrape[i],txtSareeDrape[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Hair Dying":
                for (int i=0;i<txtDye.length;i++){
                    dataFull = new GetFullDespDataImg(imgDye[i],txtDye[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Blow Dry":
                for (int i=0;i<txtBlowDry.length;i++){
                    dataFull = new GetFullDespDataImg(imgBlowDry[i],txtBlowDry[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;



            //Home Beauty Care Data Selection






            case "Face Care":
                for (int i=0;i<txtFaceCare.length;i++){
                    dataFull = new GetFullDespDataImg(imgFaceCare[i],txtFaceCare[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Hair Care":
                for (int i=0;i<txtHaircare.length;i++){
                    dataFull = new GetFullDespDataImg(imgHairCare[i],txtHaircare[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Skin Care":
                for (int i=0;i<txtSkinCare.length;i++){
                    dataFull = new GetFullDespDataImg(imgSkinCare[i],txtSkinCare[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Food Tips":
                for (int i=0;i<txtFoodTips.length;i++){
                    dataFull = new GetFullDespDataImg(imgFoodTips[i],txtFoodTips[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Hand Care":
                for (int i=0;i<txtHandCare.length;i++){
                    dataFull = new GetFullDespDataImg(imgHandCare[i],txtHandCare[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;
            case "Leg Care":
                for (int i=0;i<txtLegCare.length;i++){
                    dataFull = new GetFullDespDataImg(imgLegCare[i],txtLegCare[i]);
                    readFullImgTxt.add(dataFull);
                }
                break;

            default:
                for (int i=0;i<stringFullImgNameList.length;i++){
                    dataFull = new GetFullDespDataImg(integerFullImageList[i],stringFullImgNameList[i]);
                    readFullImgTxt.add(dataFull);
                }
        }

        return readFullImgTxt;
    }
}
