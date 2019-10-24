grammar test;

//parser rules

blazon : tincture | seme | complexField;

tincture : (tinctureNames ('and' tinctureNames)?) ','? | 'of the field';

tinctureNames : 'Argent' | 'Or' | 'Gules' | 'Sable' | 'Azure' | 'Vert' | 'Purpure' | 'Murrey' | 'Sanguine' | 'Tenne';

complexField : coatDivision? tincture seme? fieldPosition? 'and'? ordinary* fieldPosition? cadency? ;

fieldPosition : 'over all' ordinary | ( 'on a ' ordinaryNames tincture? charges?) ;

ordinaryPosition : ('and' number)? 'in' ('chief' | 'base' | 'bend' | 'chevron' | 'pale' | 'fess') ;

escutcheonLocations : 'dexter' | 'sinister' ;

direction : 'palewise' | 'fesswise' ;

coatDivision : ('party' | 'parted')? 'per' ordinaryNames ;

seme : (('seme of' subordinary ('s' | 'es') ) | 'semy-de-lis' | 'crusily' | 'bezante' | 'plate' | 'billete' | 'annulletty' | 'etincelle' | 'gouttee' | 'tortelly') tincture? ;

ordinary : ordinaryPosition? (number (ordinaryNames | subordinary) ('s' | 'es')? tincture? | animal | diminutiveNames) direction? ordinaryPosition? 'debruised by'? (charges | animal)? escutcheonLocations? ;

diminutiveNames : (PALLET | ENDORSE | BAR | BARRULET | HAMADE | RIBBON | BATON | BendletSinister) ('s' | 'es')? ;

charges : 'between'? number subordinary ('s' | 'es')? direction? ordinaryPosition* tincture ;    

subordinary : (LOZENGE | BILLET | ANNULET | ROUNDEL | LABEL | FRET | BATON | HorsesHead | TORTEAUX | ROSE | SPEAR | SHELL | QUARTER | CANTON | FLAUNCH | GORE | GYRON | ORLE | ESCUTCHEON | FUSIL | MASCLE | RUSTRE | ANNULET) ;

ordinaryNames : FESS | PALE | BEND | BendSinister | SALTIRE | CROSS | QUARTERLY | CHEVRON | PALL | CRESCENT | TORTEAUX | BORDURE | PILE ;

number : 'a' | 'an' | 'as many' | 'one' | 'two' | 'three' | 'four' | 'five' ;

animal : number animalNames animalPosition+ ordinaryPosition? tincture ;

animalNames : LION | TYGER | BengalTiger | LEOPARD | FOX | WOLF | BEAR | BADGER | OTTER | THYLACINE | PANTHER | CAT | HOUND | WEASEL | ANTELOPE | COW | CAMEL | DEER | ELEPHANT | HIPPOPOTAMUS | RHINOCEROS | SWINE | SHEEP ;

animalPosition : 'rampant' | 'segreant' | 'passant' | 'statant' | 'tripant' | 'guardant';

cadency : 'with'? 'a' cadencyNames tincture? ('for' ('difference' | 'distinction'))? ;

cadencyNames : (LOZENGE | ('label of' number 'points')  | CRESCENT | MULLET | MARTLET | ANNULET | FleurDeLys | ROSE | CrossMoline | DoubleQuatrefoil) ('s' | 'es')? ;

//lexer rules

PALLET : 'pallet' ;
ENDORSE : 'endorse' ;
BAR: 'bar' ;  
BARRULET: 'barrulet' ;
HAMADE : 'hamade' ; 
RIBBON : 'ribbon' ;
BATON : 'baton' ;
BendletSinister : 'bendlet sinister' ;
LOZENGE : 'lozenge' ;
BILLET : 'billet' ;
ROUNDEL : 'roundel' ;
LABEL : 'label' ;
FRET : 'fret' ;
HorsesHead : 'horses\' head' ;
TORTEAUX : 'torteaux' ;
ROSE : 'rose' ;
SPEAR : 'spear' ;
SHELL : 'shell' ;
QUARTER : 'quarter' ;
CANTON : 'canton' ;
FLAUNCH : 'flaunch' ;
GORE : 'gore' ;
GYRON : 'gyron' ;
ORLE : 'orle' ;
ESCUTCHEON : 'escutcheon' ;
FUSIL : 'fusil' ;
MASCLE : 'mascle' ;
RUSTRE : 'rustre' ;
ANNULET : 'annulet' ;
FESS : 'fess' ;
PALE : 'pale' ;
BEND : 'bend' ;
BendSinister : 'bend sinister' | 'bends sinister' ;
SALTIRE : 'saltire' ;
CROSS : 'cross' ;
QUARTERLY : 'quarterly' | 'quarterlies' ;  
CHEVRON : 'chevron' ;
PALL : 'pall' ;
CRESCENT : 'crescent' ;
BORDURE : 'bordure' ;
PILE : 'pile' ;

LION : 'lion' ;
TYGER : 'tyger' ;
BengalTiger : 'bengal tiger' ; 
LEOPARD : 'leopard' ;
FOX : 'fox' ; 
WOLF : 'wolf' | 'wolves' ;
BEAR : 'bear' ;
BADGER : 'badger' ;
OTTER : 'otter' ;
THYLACINE : 'thylacine' ; 
PANTHER : 'panther' ;
CAT : 'cat' ;
HOUND : 'hound' ;
WEASEL : 'weasel' ;
ANTELOPE : 'antelope' ;
COW : 'cow' ;
CAMEL : 'camel' ;
DEER : 'deer' ;
ELEPHANT : 'elephant' ; 
HIPPOPOTAMUS : 'hippopotamus' ;
RHINOCEROS : 'rhinoceros' ;
SWINE : 'swine' ;
SHEEP : 'sheep' ;


MULLET : 'mullet' ;
MARTLET : 'martlet' ; 
FleurDeLys : 'fleur-de-lys' | 'fleurs-de-lys' ;
CrossMoline : ('cross' | 'crosses') ' moline' ;
DoubleQuatrefoil : 'double quatrefoil' ;




WS  : [ \t\r\n]+ -> skip ;