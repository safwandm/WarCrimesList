package com.example.warcrimes;


import java.util.ArrayList;

public class CrimesData {
    private static String[] crimeName = {
            "Rape of belgium",
            "Armenian genocide",
            "American mutilation of the dead",
            "Bodo league massacre",
            "NO Gun ri massacre",
            "Rheinwiesenlager",
            "Foibe massacre",
            "Iași_pogrom",
            "Urkun",
            "Manile massacre"
    };

    private static String[] CrimeDetails = {
            "The Rape of Belgium is a phrase given to the German mistreatment of civilians during the invasion and subsequent occupation of Belgium during World War I." + "\n" + "\nThe neutrality of Belgium had been guaranteed by the Treaty of London (1839), which had been signed by Prussia. However, the German Schlieffen Plan required that German armed forces pass through Belgium (thus violating Belgium’s neutrality) in order to outflank the French Army, concentrated in eastern France. The German Chancellor Theobald von Bethmann Hollweg dismissed the treaty of 1839 as a \"scrap of paper\".Throughout the beginning of the war, the German army engaged in numerous atrocities against the civilian population of Belgium, including the destruction of civilian property; 6,000 Belgians were killed, and 17,700 died during expulsion, deportation, imprisonment, or death sentence by court.Another 3,000 Belgian civilians died due to electric fences the German Army put up to prevent civilians from fleeing the country, and 120,000 became forced laborers, with half of that number deported to Germany.25,000 homes and other buildings in 837 communities were destroyed in 1914 alone, and 1.5 million Belgians (20% of the entire population) fled from the invading German army.       ",
            "The Armenian Genocide (Armenian: Հայոց ցեղասպանություն,Hayots tseghaspanutyun; Turkish: Ermeni Soykırımı/Ermeni Kırımı; French: Génocide arménien), also known as the Armenian Holocaust,was the Ottoman government's systematic extermination of 700,000 to 1.5 million Armenians,mostly citizens of the Ottoman Empire.The starting date is conventionally held to be 24 April 1915, the day that Ottoman authorities rounded up, arrested, and deported from Constantinople (now Istanbul) to the region of Angora (Ankara), 235 to 270 Armenian intellectuals and community leaders, the majority of whom were eventually murdered.",
            "During World War II, some members of the United States military mutilated dead Japanese service personnel in the Pacific theater. The mutilation of Japanese service personnel included the taking of body parts as \"war souvenirs\" and \"war trophies\". Teeth and skulls were the most commonly taken 'trophies', although other body parts were also collected." + "\n" + "\nThe phenomenon of \"trophy-taking\" was widespread enough that discussion of it featured prominently in magazines and newspapers, and Franklin Roosevelt himself was reportedly given, by U.S. Representative Francis E. Walter, a gift of a letter-opener made of a Japanese soldier's arm (Roosevelt later ordered that the gift be returned and called for its proper burial).The news was also widely reported to the Japanese public, where the Americans were portrayed as \"deranged, primitive, racist and inhuman\". This compounded by a previous Life magazine picture of a young woman with a skull trophy was reprinted in the Japanese media and presented as a symbol of American barbarism, causing national shock and outrage." + "\n" + "\nThe behavior was officially prohibited by the U.S. military, which issued additional guidance as early as 1942 condemning it specifically.",
            "The Bodo League massacre (Korean: 보도연맹 학살사건; Hanja: 保導聯盟虐殺事件) was a massacre and war crime against communists and suspected sympathizers (many of whom were civilians who had no connection with communism or communists) that occurred in the summer of 1950 during the Korean War. Estimates of the death toll vary. Historians and experts on the Korean War estimate that the full total ranges from at least 60,000–110,000 (Kim Dong-choon) to 200,000 (Park Myung-lim).The massacre was wrongly blamed on the communists.[3] For four decades the South Korean government concealed this massacre. Survivors were forbidden by the government from revealing it, under suspicion of being communist sympathizers. Public revelation carried with it the threat of torture and death. During the 1990s and onwards, several corpses were excavated from mass graves, resulting in public awareness of the massacre.",
            "The No Gun Ri massacre (Korean: 노근리 민간인 학살 사건; Hanja: 老斤里良民虐殺事件; RR: Nogeun-ri minganin haksal sageon) occurred on July 26–29, 1950, early in the Korean War, when an undetermined number of South Korean refugees were killed in a U.S. air attack and by small- and heavy-weapons fire of the 7th Cavalry Regiment at a railroad bridge near the village of Nogeun-ri (Korean: 노근리), 100 miles (160 km) southeast of Seoul. In 2005, a South Korean government inquest certified the names of 163 dead or missing and 55 wounded, and added that many other victims' names were not reported. The South Korean government-funded No Gun Ri Peace Foundation estimated in 2011 that 250–300 were killed, mostly women and children.",
            "The Rheinwiesenlager (German: [ˈʁaɪnˌviːzn̩ˌlaːɡɐ], Rhine meadow camps) were a group of 19 camps built in the Allied-occupied part of Germany by the U.S. Army to hold captured German soldiers at the close of the Second World War. Officially named Prisoner of War Temporary Enclosures (PWTE), they held between one and almost two million surrendered Wehrmacht personnel from April until September 1945.",
            "The \"foibe massacres,\" or simply \"the foibe,\" literally refers to mass killings by which the corpses were thrown into foibas (deep natural sinkholes; by extension also mine shafts etc.), perpetrated mainly by Yugoslav Partisans and Chetniks, mainly in Venezia Giulia, Istria and Dalmatia, against the local Italian population, during and after World War II." + "\n" + "\nin a wider or symbolic sense it refers, for some authors, to all disappearances or killings of Italian people in the territories occupied by Yugoslav forces, thus excluding possible 'foibe' killings by other parties or forces.",
            "The Iași pogrom (Romanian pronunciation: [ˈjaʃʲ])was a series of pogroms launched by governmental forces under Marshal Ion Antonescu in the Romanian city of Iaşi against its Jewish community, which lasted from 29 June to 6 July 1941. According to Romanian authorities,over 13,266 people,or one third of the Jewish population, were massacred in the pogrom itself or in its aftermath, and many were deported.",
            "Urkun was not covered by Soviet textbooks, and monographs on the subject were removed from Soviet printing houses. As the Soviet Union was disintegrating in 1991, interest in Urkun grew. Some survivors have begun to label the events a \"massacre\" or \"genocide.\"In August 2016, a public commission in Kyrgyzstan concluded that the 1916 mass crackdown was labelled as \"genocide\".",
            "The Manila massacre (Filipino: Pagpatay sa Maynila) involved atrocities committed against Filipino civilians in the City of Manila, the capital of the Philippines, by Japanese troops during World War II at the Battle of Manila (February 3, 1945 – March 3, 1945). The combined death toll of civilians for the battle of Manila was about 100,000." + "\n" + "\nThe Manila massacre was one of several major war crimes committed by the Imperial Japanese Army, as judged by the postwar military tribunal. The Japanese commanding general, Tomoyuki Yamashita, and his chief of staff Akira Mutō, were held responsible for the massacre and other war crimes in a trial starting October 1945. Yamashita was executed on 23 February 1946 and Mutō on 23 December 1948."
    };

    private static int[] CrimeImages = {
            R.drawable.rape_of_belgium,
            R.drawable.armenian_genocide,
            R.drawable.american_mutilation,
            R.drawable.bodo_league_massacre,
            R.drawable.no_gun_ri_massacre,
            R.drawable.rheinwiesenlager,
            R.drawable.foibe_massacres,
            R.drawable.jew,
            R.drawable.urkun,
            R.drawable.manila_massacre
    };

    static ArrayList<Crime> getCrimesData() {
        ArrayList<Crime> list = new ArrayList<>();
        for (int position = 0;position <crimeName.length; position++) {
            Crime crime = new Crime();
            crime.setName(crimeName[position]);
            crime.setDetail(CrimeDetails[position]);
            crime.setPhoto(CrimeImages[position]);
            list.add(crime);
        }
        return list;
    }}

