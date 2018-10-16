import java.util.regex.Matcher;
import java.util.regex.Pattern;

import area.Area;

/**
 * 新疆号段
 * 
 * @author Kraken 2018年10月15日
 */
public class 新疆 implements Area {
	// 阿克苏
	String 阿克苏 = "1303126|1303127|1304046|1307002|1307003|1309408|1309517|1310909|1311997|1313974|"
			+ "1313986|1313997|1315027|1315028|1315042|1315048|1317988|1317997|1319974|1319997|1320116|"
			+ "1320905|1323908|1323982|1323983|1323984|1323986|1323997|1327906|1327909|1327976|1327979|"
			+ "1327980|1327997|1328997|1330997|1331978|1331997|1332551|1334535|1334536|1336472|1336473|"
			+ "1336487|1336987|1336988|1336997|1337973|1339497|1339498|1339905|1339997|1356510|1356511|"
			+ "1356512|1356513|1356514|1356515|1356516|1356568|1356569|1357910|1357911|1357912|1357913|"
			+ "1357914|1357935|1357936|1357937|1357938|1357939|1364997|1365752|1365756|1365757|1365758|"
			+ "1370997|1377940|1377941|1377942|1377943|1377944|1377945|1377946|1377947|1377974|1377975|"
			+ "1377976|1377977|1377978|1377979|1377980|1377981|1389920|1389921|1389922|1389923|1389924|"
			+ "1389925|1389926|1389927|1389928|1390997|1399906|1399907|1399966|1399967|1452787|1479920|"
			+ "1479921|1479922|1500300|1500301|1500302|1500303|1500304|1500305|1500306|1500908|1500997|"
			+ "1502627|1502628|1502635|1502636|1502637|1502638|1502639|1509927|1509928|1509929|1510907|"
			+ "1510908|1510997|1519920|1519921|1520997|1527640|1527641|1529230|1529231|1529232|1529233|"
			+ "1529234|1529235|1529236|1529237|1529238|1529239|1529250|1529251|1529252|1529253|1529254|"
			+ "1529255|1529256|1529257|1529940|1529957|1529958|1529959|1530997|1556900|1556904|1556905|"
			+ "1556906|1556907|1556908|1556909|1556920|1556921|1556922|1559971|1559972|1559973|1559974|"
			+ "1559975|1559976|1559977|1559978|1559990|1559995|1559996|1559997|1560997|1569900|1569907|"
			+ "1569935|1569936|1569940|1569941|1569942|1571494|1571900|1572998|1580907|1580997|1588680|"
			+ "1588681|1588682|1588683|1588684|1588685|1589930|1589931|1589932|1589933|1589934|1589935|"
			+ "1589936|1590907|1590997|1599920|1599921|1599922|1599940|1599941|1599942|1820997|1829955|"
			+ "1829956|1829957|1829958|1829959|1860907|1860997|1869970|1869971|1869972|1869973|1869974|"
			+ "1869975|1869976|1869977|1869978|1869979|1870997|1874260|1874261|1874262|1874263|1874264|"
			+ "1879990|1879991|1879992|1879993|1879994|1879995|1880907|1880997|1889920|1889921|1889922|"
			+ "1889923|1889924|1890997|1899766|1899767|1899786|1899787|1899906|1899907|1899966|1899967";
	// 阿勒泰
	String 阿勒泰 = "1304059|1307032|1307033|1309400|1311905|1311906|1313979|1313983|1319979|1320906|"
			+ "1328906|1331906|1331976|1334531|1336486|1336906|1339906|1339974|1356517|1356518|"
			+ "1356579|1357918|1357919|1364991|1369993|1369994|1377905|1377938|1377939|1380996|"
			+ "1389940|1389941|1389942|1399945|1399978|1399979|1452796|1470905|1470906|1500906|"
			+ "1500907|1502282|1509931|1510906|1519950|1519951|1519952|1519953|1519954|1520904|"
			+ "1520905|1529938|1529939|1529941|1529970|1529971|1534996|1535261|1569906|1571490|"
			+ "1571901|1580906|1590906|1820906|1820907|1829976|1860906|1869060|1869061|1869062|"
			+ "1869063|1869064|1870906|1871990|1871991|1871992|1874265|1874266|1879901|1879902|"
			+ "1879903|1879904|1880906|1889900|1893582|1893589|1899751|1899752|1899778|1899779|"
			+ "1899945|1899978|1899979";

	// 博乐
	String 博乐 = "1303134|1303135|1304057|1309513|1311909|1313977|1313981|1315038|1315039|1319977|"
			+ "1320909|1323909|1328909|1331909|1331971|1334549|1336482|1336909|1336983|1339907|"
			+ "1339909|1339972|1351997|1356550|1356551|1356577|1357958|1357959|1364992|1367996|"
			+ "1367997|1377901|1377902|1389943|1389944|1399976|1399977|1452789|1470907|1470909|"
			+ "1500909|1502283|1529973|1529974|1529975|1530990|1569909|1571903|1580909|1589938|"
			+ "1590909|1599905|1599906|1820909|1860909|1869090|1869091|1869092|1869093|1869094|"
			+ "1870909|1880909|1899776|1899777|1899976|1899977";
	// 昌吉
	String 昌吉 = "1300960|1302960|1303940|1303941|1303942|1304050|1307038|1309000|1309401|1309505|"
			+ "1309506|1310900|1310901|1310902|1311900|1311994|1313970|1313994|1315035|1317994|"
			+ "1319970|1319994|1320100|1320101|1320102|1320103|1320994|1323900|1323988|1323989|"
			+ "1323994|1327900|1327905|1327994|1328900|1328905|1328994|1330994|1331900|1331905|"
			+ "1331994|1334539|1334540|1334541|1336475|1336490|1336491|1336900|1336980|1336994|"
			+ "1339496|1339908|1339970|1339994|1351996|1356530|1356531|1356532|1356533|1356534|"
			+ "1356535|1356536|1356560|1356561|1356562|1356563|1356564|1357946|1357947|1357960|"
			+ "1357961|1357962|1357963|1357964|1360994|1361996|1362995|1363998|1368990|1368991|"
			+ "1368992|1368993|1368994|1368995|1370994|1377925|1377926|1377927|1377985|1377986|"
			+ "1377987|1389960|1389961|1389962|1389963|1389964|1389965|1389966|1389967|1389968|"
			+ "1389969|1390994|1399934|1399935|1399936|1399954|1399955|1399956|1452784|1452795|"
			+ "1470994|1479913|1479914|1479915|1500165|1500166|1500167|1500168|1500169|1502615|"
			+ "1502616|1502617|1502618|1502619|1510994|1519936|1519937|1519942|1519964|1519965|"
			+ "1519966|1519967|1519968|1519969|1520994|1527642|1527643|1529258|1529259|1529260|"
			+ "1529261|1529262|1529263|1529264|1529265|1529960|1529961|1529962|1529963|1529964|"
			+ "1529965|1529966|1529967|1529968|1529969|1529997|1529998|1530994|1559961|1559979|"
			+ "1559981|1559982|1870994|1874270|1874271|1874272|1879905|1879967|1559989|1560994|"
			+ "1569904|1569905|1569923|1569924|1569930|1571496|1571990|1572996|1580994|1588690|"
			+ "1588691|1588692|1589476|1589477|1589478|1589479|1589905|1589906|1589907|1589908|"
			+ "1589909|1589927|1590905|1590994|1599907|1599908|1599909|1599935|1599936|1820994|"
			+ "1829950|1829951|1829952|1829953|1860994|1869940|1869941|1869942|1869943|1869944|"
			+ "1869945|1869946|1869947|1869948|1869949|1870905|1879968|1879969|1880905|1880994|"
			+ "1889903|1889904|1889964|1889965|1889966|1890994|1893572|1893573|1899754|1899755|"
			+ "1899756|1899780|1899781|1899782|1899934|1899935|1899936|1899954|1899955|1899956";
	// 哈密
	String 哈密 = "1303121|1303122|1304052|1307048|1309402|1309507|1311902|1313971|1315036|1319971|"
			+ "1320106|1320107|1320902|1323973|1327902|1328902|1331902|1331970|1334543|1336493|"
			+ "1336494|1336902|1337971|1339902|1339971|1356519|1356570|1357944|1357965|1357966|"
			+ "1357967|1364990|1367757|1367758|1367759|1377918|1377936|1377937|1380990|1389933|"
			+ "1389934|1389935|1389936|1399903|1399944|1399968|1452792|1470902|1479902|1500902|"
			+ "1502281|1502610|1502611|1510902|1519955|1519956|1520902|1527690|1527691|1527692|"
			+ "1529954|1529955|1529956|1529976|1529977|1529978|1534992|1535266|1569902|1571904|"
			+ "1572999|1580902|1590902|1599933|1599934|1820902|1820904|1829930|1829931|1829932|"
			+ "1829933|1829934|1829935|1829936|1860902|1869020|1869021|1869022|1869023|1869024|"
			+ "1870305|1870902|1874273|1879906|1879911|1879964|1879965|1879966|1880902|1889930|"
			+ "1889931|1899768|1899903|1899944|1899968";
	// 和田
	String 和田 = "1304049|1307007|1307008|1309409|1311903|1313976|1315043|1317989|1319976|1320903|"
			+ "1323974|1323976|1323980|1323981|1327903|1328901|1328903|1328907|1331903|1331979|"
			+ "1334538|1336489|1336903|1339903|1339979|1356549|1356552|1356553|1357968|1357969|"
			+ "1364994|1366757|1366758|1369930|1369931|1369932|1377919|1377928|1377929|1389945|"
			+ "1389946|1389947|1399905|1399943|1399965|1452793|1470903|1470904|1500140|1500141|"
			+ "1500142|1500143|1500144|1500145|1500150|1500151|1500152|1500153|1500154|1500903|"
			+ "1500904|1500905|1502613|1502614|1510903|1510990|1519923|1519924|1519925|1519926|"
			+ "1519927|1519928|1519929|1519941|1519970|1519971|1519972|1519973|1519974|1519975|"
			+ "1519976|1519977|1519978|1519979|1520900|1520903|1521490|1521491|1521492|1521493|"
			+ "1521494|1527600|1527659|1529266|1529267|1529268|1529269|1529270|1529271|1529280|"
			+ "1529281|1529282|1529283|1529284|1529295|1529296|1529297|1529298|1529299|1534995|"
			+ "1535263|1556901|1556902|1556903|1559960|1559970|1559980|1559993|1569903|1569931|"
			+ "1569943|1571493|1571905|1580903|1588687|1589409|1590903|1599903|1599904|1599937|"
			+ "1599938|1820903|1860903|1869030|1869031|1869032|1869033|1869034|1869035|1869036|"
			+ "1869037|1869038|1869039|1870903|1871995|1871996|1871997|1871998|1871999|1874275|"
			+ "1874276|1874277|1874278|1874279|1879924|1879925|1879930|1879931|1879932|1879933|"
			+ "1879934|1879935|1879936|1879937|1879938|1879939|1879940|1879941|1879942|1879943|"
			+ "1879944|1879945|1879946|1879947|1879948|1879949|1879950|1879951|1879952|1879953|"
			+ "1879954|1879955|1879956|1879957|1879958|1879959|1880903|1889925|1889926|1889927|"
			+ "1889928|1889929|1893579|1899753|1899765|1899905|1899943|1899965";
	// 喀什
	String 喀什 = "1302963|1303128|1303129|1304048|1307004|1307005|1309515|1309519|1311998|1312396|"
			+ "1313975|1313998|1315029|1315041|1315044|1317998|1319973|1319998|1320105|1320118|"
			+ "1320119|1320907|1323901|1323970|1323972|1323987|1323998|1327901|1327970|1327971|"
			+ "1327972|1327973|1327981|1327982|1327984|1327985|1327986|1327987|1327988|1327989|"
			+ "1327990|1327998|1328998|1330998|1331998|1332552|1334534|1336474|1336488|1336989|"
			+ "1336998|1337974|1337975|1339977|1339978|1339998|1356537|1356538|1356539|1356565|"
			+ "1356566|1356567|1357905|1357906|1357907|1357908|1357909|1357930|1357931|1357932|"
			+ "1357933|1357934|1530998|1533797|1535258|1556910|1556911|1556912|1556913|1556914|"
			+ "1556915|1556916|1556917|1556918|1556919|1559983|1559984|1559994|1559998|1361998|"
			+ "1362998|1365750|1365751|1365753|1365754|1365755|1370998|1377948|1377949|1377962|"
			+ "1377971|1377972|1377973|1377984|1377988|1377989|1389910|1389911|1389912|1389913|"
			+ "1389914|1389915|1389916|1389917|1389918|1389919|1452788|1479910|1479911|1479912|"
			+ "1500146|1500147|1500148|1500149|1500155|1500307|1500308|1500309|1500994|1500998|"
			+ "1500999|1502630|1502631|1502632|1502633|1502634|1509900|1509901|1509902|1509939|"
			+ "1390998|1399908|1399909|1399963|1399964|1510904|1510905|1510998|1519930|1519931|"
			+ "1519932|1519933|1519934|1519935|1519980|1519981|1519982|1519983|1519984|1519985|"
			+ "1519986|1519987|1519988|1519989|1520906|1520998|1521495|1521496|1521497|1521498|"
			+ "1521499|1527601|1527602|1527603|1527604|1527605|1527606|1527607|1527608|1527609|"
			+ "1527610|1527611|1527612|1527613|1527644|1527645|1527693|1527694|1527695|1529290|"
			+ "1529291|1529292|1529293|1529294|1529951|1529952|1529953|1560998|1569944|1569945|"
			+ "1569946|1569947|1580904|1580998|1588688|1588689|1589400|1589401|1589402|1589403|"
			+ "1589404|1589405|1589406|1589407|1589408|1571499|1571906|1572997|1590904|1590998|"
			+ "1599923|1599924|1599930|1599931|1599932|1820998|1829900|1829901|1829902|1829903|"
			+ "1829960|1829961|1829962|1829963|1829964|1829965|1829966|1829967|1829968|1829969|"
			+ "1860904|1860998|1869980|1869981|1869982|1869983|1869984|1869985|1869986|1869987|"
			+ "1869988|1869989|1870998|1874280|1874281|1874282|1874283|1879986|1879987|1879988|"
			+ "1879989|1880998|1889932|1889933|1889934|1889935|1889936|1890998|1899763|1899764|"
			+ "1899774|1899775|1899785|1899908|1899909|1899963|1899964";
	// 克拉玛依
	String 克拉玛依 = "1303138|1303139|1304055|1307037|1307039|1307046|1309405|1309510|1311990|1313990|"
			+ "1317990|1319990|1320108|1323977|1323990|1328990|1330990|1331990|1332567|1332568|"
			+ "1334547|1336470|1336499|1336905|1336990|1339494|1339900|1339990|1351990|1351991|"
			+ "1356545|1356546|1357950|1357951|1357952|1357953|1370990|1361999|1362997|1368996|"
			+ "1368997|1368998|1368999|1380099|1389956|1389957|1389958|1389959|1390990|1399930|"
			+ "1399931|1399950|1399951|1399952|1452780|1470990|1479916|1479917|1479918|1479919|"
			+ "1500990|1502285|1502612|1519963|1590990|1599939|1520990|1529950|1529979|1529999|"
			+ "1880990|1889938|1889939|1889963|1534990|1535265|1571907|1571996|1820990|1560990|"
			+ "1580900|1580905|1580990|1589939|1899952|1860990|1869900|1869901|1869902|1869903|"
			+ "1869904|1870990|1879920|1879921|1879922|1879923|1879999|1890990|1893583|1899930|"
			+ "1899931|1899950|1899951";
	// 克州
	String 克州 = "1311908|1317986|1319975|1320908|1327908|1328908|1331908|1334537|1336908|1336984|"
			+ "1337970|1339490|1357956|1357957|1364993|1366759|1377903|1377960|1377961|1389948|"
			+ "1389949|1534997|1590908|1860908|1899750|1899769";
	// 库尔勒
	String 库尔勒 = "1302962|1303123|1303124|1303125|1304045|1307000|1307001|1309407|1309516|1311907|"
			+ "1311996|1313972|1313973|1313984|1313985|1313996|1315023|1315024|1315025|1315026|"
			+ "1317987|1317996|1319972|1319996|1320113|1320114|1320115|1320904|1323906|1323907|"
			+ "1323985|1323996|1327904|1327977|1327978|1327996|1328996|1330996|1331907|1331977|"
			+ "1331996|1332550|1334532|1334533|1334545|1336484|1336485|1336907|1336985|1336986|"
			+ "1336996|1337976|1339904|1339975|1339976|1339996|1356500|1356501|1356502|1356503|"
			+ "1356504|1356505|1356506|1356507|1356508|1356509|1356574|1356575|1356576|1357900|"
			+ "1357901|1357902|1357903|1357904|1357948|1357949|1361995|1362996|1363999|1366750|"
			+ "1366751|1366752|1366753|1366754|1366755|1366756|1369933|1369934|1370995|1370996|"
			+ "1377904|1377923|1377924|1377930|1377931|1377932|1377933|1377934|1377963|1377964|"
			+ "1377965|1377966|1377967|1377968|1377969|1389900|1389901|1389902|1389903|1389904|"
			+ "1389905|1389906|1389907|1389908|1389909|1390996|1399900|1399901|1399902|1399960|"
			+ "1399961|1399962|1452786|1452794|1470996|1479907|1479908|1479909|1500156|1500157|"
			+ "1500158|1500159|1509922|1509923|1509924|1509925|1509926|1509945|1509946|1509947|"
			+ "1509948|1509949|1510996|1519939|1519990|1519991|1519992|1519993|1519994|1520996|"
			+ "1527614|1527615|1527616|1527617|1527618|1527619|1527620|1527621|1527622|1527623|"
			+ "1527624|1527625|1527626|1527627|1527628|1527629|1527646|1527647|1529934|1529935|"
			+ "1529936|1529937|1530996|1533796|1535252|1560996|1569925|1569926|1569927|1569928|"
			+ "1569929|1569934|1571495|1571908|1571997|1580996|1588686|1589900|1589901|1589902|"
			+ "1589903|1589904|1590996|1599900|1599901|1599902|1599943|1820996|1829977|1829978|"
			+ "1829979|1860996|1869960|1869961|1869962|1869963|1869964|1869965|1869966|1869967|"
			+ "1869968|1869969|1870996|1874285|1874286|1874287|1874288|1879980|1879981|1879982|"
			+ "1879983|1879984|1879985|1879998|1880900|1880904|1880996|1889901|1889967|1889968|"
			+ "1889969|1893574|1893575|1899760|1899761|1899762|1899960|1899961|1899962";
	// 奎屯
	String 奎屯 = "1303130|1303131|1304053|1307049|1309403|1309508|1311992|1313992|1315037|1317992|"
			+ "1319992|1320900|1323902|1323975|1323992|1327992|1328992|1330992|1331992|1332565|"
			+ "1336495|1336496|1336992|1337972|1339492|1339992|1351994|1351995|1356556|1356557|"
			+ "1356572|1357915|1357916|1357917|1364998|1367750|1367751|1367752|1370992|1370993|"
			+ "1377906|1377907|1377908|1377909|1380992|1389954|1389955|1390003|1399970|1399971|"
			+ "1399972|1452782|1470992|1479905|1479906|1500160|1500992|1502289|1502629|1509920|"
			+ "1509921|1510992|1519995|1519996|1519997|1520992|1529932|1529933|1529942|1529981|"
			+ "1529982|1529983|1530992|1533798|1535269|1535270|1560992|1571909|1572995|1580992|"
			+ "1589928|1590992|1599948|1599949|1820900|1820992|1829939|1860992|1869920|1869921|"
			+ "1869922|1869923|1869924|1870306|1870307|1870992|1874284|1874290|1879912|1879926|"
			+ "1879977|1879978|1879979|1880992|1889902|1889962|1893585|1893586|1893587|1893588|"
			+ "1899770|1899771|1899772|1899970|1899971|1899972";
	// 石河子
	String 石河子 = "1302961|1303132|1303133|1304054|1307009|1309404|1309509|1311993|1313993|1315040|"
			+ "1317993|1319993|1320109|1323903|1323993|1327993|1328993|1330993|1331993|1332566|"
			+ "1334546|1336497|1336498|1336981|1336993|1339493|1339993|1351992|1351993|1356554|"
			+ "1356555|1356573|1357945|1357974|1357975|1357976|1357977|1364999|1367753|1367754|"
			+ "1367755|1367756|1377920|1377921|1377935|1377959|1377970|1389950|1389951|1389952|"
			+ "1389953|1390993|1399932|1399933|1399953|1399973|1452783|1470993|1479900|1479901|"
			+ "1500161|1500162|1500163|1500164|1500993|1502622|1502623|1502624|1510993|1519938|"
			+ "1519957|1519958|1519959|1520993|1527630|1527631|1527648|1529943|1529990|1529991|"
			+ "1529992|1529993|1529994|1529995|1529996|1530993|1535260|1560993|1569932|1569933|"
			+ "1571991|1572993|1580993|1588693|1589929|1590993|1598170|1599929|1820905|1820993|"
			+ "1829907|1829908|1829909|1829937|1829938|1860993|1869930|1869931|1869932|1869933|"
			+ "1869934|1870308|1870309|1870993|1874291|1874292|1879907|1879927|1879928|1879929|"
			+ "1879973|1879974|1879975|1879976|1880993|1889953|1889959|1889961|1890993|1893570|"
			+ "1893571|1893581|1899773|1899788|1899789|1899932|1899933|1899953|1899973";
	// 塔城
	String 塔城 = "1304058|1307030|1307031|1309514|1311901|1313978|1313982|1315022|1319978|1320901|"
			+ "1331901|1331975|1334530|1336483|1336901|1339901|1339973|1356527|1356528|1356529|"
			+ "1356578|1357978|1357979|1364996|1367998|1367999|1377922|1380997|1389937|1389938|"
			+ "1389939|1399948|1399949|1399974|1399975|1452791|1470900|1470901|1502280|1509930|"
			+ "1510901|1516080|1520901|1527687|1527688|1527689|1527697|1527698|1527699|1529984|"
			+ "1529985|1529986|1534994|1535259|1569901|1571992|1572992|1580901|1590901|1598171|"
			+ "1820901|1860901|1869010|1869011|1869012|1869013|1869014|1870304|1870901|1874274|"
			+ "1874289|1879900|1879970|1879971|1879972|1880901|1889937|1893580|1899948|1899949|" + "1899974|1899975";
	// 吐鲁番
	String 吐鲁番 = "1303120|1304051|1307034|1309504|1310903|1311995|1313995|1317995|1319995|1320104|"
			+ "1323971|1323995|1327995|1328995|1330995|1331995|1334542|1336492|1336995|1339495|"
			+ "1339995|1356558|1356559|1356571|1357954|1357955|1364995|1369990|1369991|1369992|"
			+ "1377900|1389930|1389931|1389932|1390995|1399904|1399946|1399947|1399969|1452785|"
			+ "1470995|1479903|1500995|1500996|1502286|1502287|1502625|1502626|1510995|1516081|"
			+ "1516082|1516083|1516084|1516085|1520995|1527696|1529272|1529930|1529931|1529944|"
			+ "1529987|1529988|1529989|1530995|1535267|1560995|1571993|1572994|1580995|1590995|"
			+ "1820995|1829904|1829905|1829929|1829954|1860995|1869950|1869951|1869952|1869953|"
			+ "1869954|1870907|1870995|1871994|1880995|1889960|1890995|1899904|1899946|1899947|" + "1899969";
	// 乌鲁木齐
	String 乌鲁木齐 = "1300961|1300962|1300963|1300964|1300965|1300966|1300967|1300968|1300969|1301096|"
			+ "1302964|1302965|1302966|1302967|1303943|1303944|1303945|1303946|1303947|1303948|"
			+ "1303949|1307040|1307041|1307042|1307043|1307044|1307045|1307990|1307991|1307992|"
			+ "1307993|1307994|1307995|1307996|1307997|1307998|1307999|1309500|1309501|1309502|"
			+ "1309503|1309518|1310990|1310991|1310992|1310993|1310994|1310995|1310996|1310997|"
			+ "1310998|1310999|1311904|1311991|1313960|1313961|1313962|1313963|1313964|1313965|"
			+ "1313966|1313967|1313968|1313969|1313987|1313988|1313989|1313991|1315030|1315031|"
			+ "1315032|1315033|1315034|1315045|1315046|1315047|1315049|1317980|1317981|1317982|"
			+ "1317983|1317984|1317991|1319980|1319981|1319982|1319983|1319984|1319985|1319986|"
			+ "1319987|1319988|1319989|1319991|1320120|1320121|1320122|1320123|1320124|1320125|"
			+ "1320126|1320127|1320128|1320129|1320130|1320131|1320132|1320133|1320134|1320135|"
			+ "1320136|1320137|1320138|1320139|1320990|1320991|1320992|1320993|1320995|1320996|"
			+ "1320997|1320998|1320999|1323991|1327983|1327991|1328991|1330991|1331904|1331980|"
			+ "1331981|1331982|1331983|1331984|1331985|1331986|1331987|1331988|1331989|1331991|"
			+ "1332553|1332554|1332555|1332556|1332557|1332558|1332559|1332560|1332561|1332562|"
			+ "1332563|1332564|1334544|1336476|1336477|1336478|1336479|1336960|1336961|1336962|"
			+ "1336963|1336964|1336965|1336966|1336967|1336968|1336969|1336991|1337977|1337978|"
			+ "1337979|1339491|1339991|1356540|1356541|1356542|1356543|1356544|1356580|1356581|"
			+ "1356582|1356583|1356584|1356585|1356586|1356587|1356588|1356589|1356590|1356591|"
			+ "1356592|1356593|1356594|1356595|1356596|1356597|1356598|1356599|1357920|1357921|"
			+ "1357922|1357923|1357924|1357925|1357926|1357927|1357928|1357929|1357940|1357941|"
			+ "1357942|1357943|1357980|1357981|1357982|1357983|1357984|1357985|1357986|1357987|"
			+ "1357988|1357989|1357990|1357991|1357992|1357993|1357994|1357995|1357996|1357997|"
			+ "1357998|1357999|1360990|1360991|1360992|1360993|1360995|1360996|1360997|1360998|"
			+ "1360999|1361990|1361991|1361992|1361993|1361994|1362990|1362991|1362992|1362993|"
			+ "1362994|1363990|1363991|1363992|1363993|1363994|1363995|1363996|1363997|1365990|"
			+ "1365991|1365992|1365993|1365994|1365995|1365996|1365997|1365998|1365999|1366990|"
			+ "1366991|1366992|1366993|1366994|1366995|1366996|1366997|1366998|1366999|1369935|"
			+ "1369936|1369937|1369938|1369939|1369995|1369996|1369997|1369998|1369999|1370991|"
			+ "1380991|1380993|1380994|1380995|1389980|1389981|1389982|1389983|1389984|1389985|"
			+ "1389986|1389987|1389988|1389989|1389990|1389991|1389992|1389993|1389994|1389995|"
			+ "1389996|1389997|1389998|1389999|1390000|1390991|1390992|1399910|1399911|1399912|"
			+ "1399913|1399914|1399915|1399916|1399917|1399918|1399919|1399920|1399921|1399922|"
			+ "1399923|1399924|1399925|1399926|1399927|1399928|1399929|1399940|1399941|1399942|"
			+ "1399980|1399981|1399982|1399983|1399984|1399985|1399986|1399987|1399988|1399989|"
			+ "1399990|1399991|1399992|1399993|1399994|1399995|1399996|1399997|1399998|1399999|"
			+ "1452781|1452790|1470991|1470997|1470998|1470999|1479926|1479927|1479928|1479929|"
			+ "1500900|1500901|1500991|1502290|1502291|1502292|1502293|1502294|1502295|1502296|"
			+ "1502297|1502298|1502299|1502600|1502601|1502602|1502603|1502604|1502605|1502606|"
			+ "1502607|1502608|1502609|1509903|1509904|1509905|1509906|1509907|1509908|1509909|"
			+ "1509910|1509911|1509912|1509913|1509914|1509915|1509916|1509917|1509918|1509919|"
			+ "1509932|1509933|1509934|1509935|1509936|1509937|1509950|1509951|1509952|1509953|"
			+ "1509954|1509955|1509956|1509957|1509958|1509959|1509960|1509961|1509962|1509963|"
			+ "1509964|1509965|1509966|1509967|1509968|1509969|1510900|1510991|1516087|1516088|"
			+ "1516089|1516090|1516091|1516092|1516093|1516094|1516095|1516096|1516097|1516098|"
			+ "1516099|1519900|1519901|1519902|1519903|1519904|1519905|1519906|1519907|1519908|"
			+ "1519909|1519910|1519911|1519912|1519913|1519914|1519915|1519916|1519917|1519918|"
			+ "1519919|1519943|1519944|1519945|1519946|1519947|1519948|1519949|1520991|1521480|"
			+ "1521481|1521482|1521483|1521484|1527650|1527651|1527652|1527653|1527654|1527655|"
			+ "1527656|1527657|1527660|1527661|1527662|1527663|1527664|1527665|1527666|1527667|"
			+ "1527668|1527669|1527670|1527671|1527672|1527673|1527674|1527675|1527676|1527677|"
			+ "1527678|1527679|1527682|1527683|1527684|1527685|1527686|1529240|1529241|1529242|"
			+ "1529243|1529244|1529245|1529246|1529247|1529248|1529249|1529285|1529286|1529287|"
			+ "1529288|1529289|1529905|1529906|1529907|1529908|1529909|1529910|1529911|1529912|"
			+ "1529913|1529914|1529915|1529916|1529917|1529918|1529919|1529945|1529946|1529947|"
			+ "1529948|1529949|1530991|1533793|1534991|1534993|1534998|1534999|1535250|1535251|"
			+ "1560991|1569910|1569911|1569912|1569913|1569914|1569915|1569916|1569917|1569918|"
			+ "1569919|1569920|1569921|1569922|1571497|1571994|1571998|1571999|1572991|1580991|"
			+ "1589460|1589461|1589462|1589463|1589464|1589465|1589466|1589467|1589468|1589469|"
			+ "1589470|1589471|1589472|1589473|1589474|1589475|1589910|1589911|1589912|1589913|"
			+ "1589914|1589915|1589916|1589917|1589918|1589919|1589920|1589921|1589922|1589923|"
			+ "1589924|1589925|1589926|1589940|1589941|1589942|1589943|1589944|1589945|1589946|"
			+ "1589947|1589948|1589949|1590900|1590991|1598174|1598175|1598176|1598177|1598178|"
			+ "1598179|1599910|1599911|1599912|1599913|1599914|1599915|1599916|1599917|1599918|"
			+ "1599919|1599944|1599945|1820991|1829906|1829910|1829911|1829912|1829913|1829914|"
			+ "1829915|1829916|1829917|1829918|1829919|1829940|1829941|1829942|1829943|1829944|"
			+ "1829945|1829946|1829947|1829948|1829949|1829972|1829973|1829974|1829975|1860900|"
			+ "1860991|1869910|1869911|1869912|1869913|1869914|1869915|1869916|1869917|1869918|"
			+ "1869919|1870300|1870301|1870302|1870303|1870991|1874293|1874294|1874295|1874296|"
			+ "1874297|1879913|1879914|1879915|1879916|1879917|1879918|1879919|1880991|1889905|"
			+ "1889906|1889907|1889908|1889909|1889910|1889911|1889912|1889913|1889914|1889915|"
			+ "1889916|1889917|1889918|1889919|1889950|1889951|1889952|1890991|1890992|1893590|"
			+ "1893591|1893592|1893593|1893594|1899790|1899791|1899792|1899793|1899794|1899795|"
			+ "1899796|1899797|1899798|1899799|1899910|1899911|1899912|1899913|1899914|1899915|"
			+ "1899916|1899917|1899918|1899919|1899920|1899921|1899922|1899923|1899924|1899925|"
			+ "1899926|1899927|1899928|1899929|1899940|1899941|1899942|1899980|1899981|1899982|"
			+ "1899983|1899984|1899985|1899986|1899987|1899988|1899989|1899990|1899991|1899992|"
			+ "1899993|1899994|1899995|1899996|1899997|1899998|1899999";
	// 伊犁
	String 伊犁 = "1303136|1303137|1304056|1307035|1307036|1307047|1309406|1309511|1309512|1310904|"
			+ "1310905|1310906|1310907|1310908|1311999|1313980|1313999|1315020|1315021|1317985|"
			+ "1317999|1319999|1320110|1320111|1320112|1323904|1323905|1323978|1323979|1323999|"
			+ "1327907|1327974|1327975|1327999|1328904|1328999|1330999|1331972|1331973|1331974|"
			+ "1331999|1332569|1334548|1336471|1336480|1336481|1336904|1336982|1336999|1339499|"
			+ "1339999|1351998|1351999|1356520|1356521|1356522|1356523|1356524|1356525|1356526|"
			+ "1356547|1356548|1357970|1357971|1357972|1357973|1361997|1362999|1367990|1367991|"
			+ "1367992|1367993|1367994|1367995|1370999|1377910|1377911|1377912|1377913|1377914|"
			+ "1377915|1377916|1377917|1377950|1377951|1377952|1377953|1377954|1377955|1377956|"
			+ "1377957|1377958|1389970|1389971|1389972|1389973|1389974|1389975|1389976|1389977|"
			+ "1389978|1389979|1390999|1399937|1399938|1399939|1399957|1399958|1399959|1452799|"
			+ "1479923|1479924|1479925|1502288|1509938|1509940|1509941|1509942|1509943|1509944|"
			+ "1510999|1519922|1519998|1519999|1520999|1521485|1521486|1521487|1521488|1521489|"
			+ "1527632|1527633|1527634|1527635|1527636|1527637|1527638|1527639|1527649|1527658|"
			+ "1529273|1529274|1529275|1529276|1529277|1529278|1529279|1529900|1529901|1529902|"
			+ "1529903|1529904|1529920|1529921|1529922|1529923|1529924|1529925|1529926|1529927|"
			+ "1529928|1529929|1530999|1535253|1535255|1556923|1556924|1556925|1556926|1556927|"
			+ "1556928|1556929|1559962|1559963|1559964|1559965|1559966|1559967|1559968|1559969|"
			+ "1559999|1560999|1569937|1569938|1569939|1569948|1569949|1571498|1571995|1572990|"
			+ "1580999|1588694|1588695|1588696|1588697|1588698|1588699|1589410|1589411|1589412|"
			+ "1589413|1589414|1589415|1589416|1589417|1589418|1589419|1590999|1598172|1598173|"
			+ "1599925|1599926|1599927|1599928|1599946|1599947|1820999|1829920|1829921|1829922|"
			+ "1829923|1829924|1829925|1829926|1829927|1829928|1860905|1860999|1869990|1869991|"
			+ "1869992|1869993|1869994|1869995|1869996|1869997|1869998|1869999|1870900|1870904|"
			+ "1870999|1874298|1874299|1879996|1879997|1880999|1889954|1889955|1889956|1889957|"
			+ "1889958|1890999|1893576|1893577|1899757|1899758|1899759|1899783|1899784|1899937|"
			+ "1899938|1899939|1899957|1899958|1899959";

	@Override
	public boolean inArea(String phone) {
		Pattern pattern = Pattern.compile(
				"^(" + 阿克苏 + "|" + 阿勒泰 + "|" + 博乐 + "|" + 昌吉 + "|" + 哈密 + "|" + 和田 + "|" + 喀什 + "|" + 克拉玛依 + "|" + 克州
						+ "|" + 库尔勒 + "|" + 奎屯 + "|" + 石河子 + "|" + 塔城 + "|" + 吐鲁番 + "|" + 乌鲁木齐 + "|" + 伊犁 + ").*");
		Matcher matcher = pattern.matcher(phone);
		return matcher.matches();
	}

}
