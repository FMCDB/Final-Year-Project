grammar test;

//parser rules

blazon : tincture | seme | complexField;

tincture : WS* (tinctureNames WS* ('and' WS* tinctureNames)?) ','? WS* | WS* 'of the field' WS*;

tinctureNames : WS* ('Argent' | 'Or' | 'Gules' | 'Sable' | 'Azure' | 'Vert' | 'Purpure' | 'Murrey' | 'Sanguine' | 'Tenne') WS*;

complexField :  WS* coatDivision?  WS* tincture  WS* seme? WS* 'and'? WS* ordinary* (charges | animal)* WS* escutcheonLocations? WS* quartering? WS* cadency? WS* bordure? ;

escutcheonLocations : WS* ('dexter' | 'sinister') WS* ;

direction : WS* ('palewise' | 'fesswise') WS* ;

coatDivision : (WS* ('party' | 'parted')? WS* 'per' WS* ordinaryNames WS*) | WS* 'quarterly' WS*;

seme : WS* (WS* ('seme of' WS* subordinary ('s' | 'es') WS* (',')? WS*) | 'semy-de-lis' | 'crusily' | 'bezante' | 'plate' | 'billete' | 'annulletty' | 'etincelle' | 'gouttee' | 'tortelly' | 'nebuly') WS* tincture? WS* ;

ordinary : WS* 'and'? WS* (animal | WS* ((number | 'on a') WS* (ordinaryNames | subordinary | diminutiveNames | seme) ('s' | 'es')? WS* tincture?) WS*) WS* direction? WS* ;

ordinaryPosition : WS* ('and' WS* number)? WS* 'in' WS* ('chief' | 'base' | 'bend' | 'chevron' | 'pale' | 'fess') WS* ;

diminutiveNames : WS* (PALLET | ENDORSE | BAR | BARRULET | HAMADE | RIBBON | BATON | BendletSinister) ('s' | 'es')? WS* ;

charges : 'and'? WS* ('charged with' | 'debruised by' | 'between' | 'over all' | ordinaryPosition)* WS* number WS* (subordinary | ordinaryNames) WS* ('s' | 'es')? WS* direction? WS* ordinaryPosition? WS* tincture? ;    

subordinary : WS* (LOZENGE | BILLET | ANNULET | ROUNDEL | LABEL | FRET | BATON | TORTEAUX | ROSE | SPEAR | SHELL | QUARTER | CANTON | FLAUNCH | GORE | GYRON | ORLE | ESCUTCHEON | FUSIL | MASCLE | RUSTRE) WS* ;

ordinaryNames : WS* (FESS | PALE | BEND | BendSinister | SALTIRE | CROSS | CHEVRON | PALL | CRESCENT | BORDURE | PILE) WS* ;

number : WS* ('a' | 'an' | 'as many' | 'one' | 'two' | 'three' | 'four' | 'five') WS* ;

quartering:  WS* (('and')? WS* 'in' WS* quarterName WS* charges)+ ;

quarterName: WS* 'the' WS* ('first' | 'second' | 'third' | 'fourth') WS* 'quarter' ;

animal : WS* 'and'? WS* number WS* animalNames ('s' | 'es')? WS* animalPosition+ WS* ordinaryPosition? WS* tincture ;

animalNames : WS* (LION | TYGER | BengalTiger | LEOPARD | FOX | WOLF | BEAR | BADGER | OTTER | THYLACINE | PANTHER | CAT | HOUND | WEASEL | ANTELOPE | COW | CAMEL | DEER | ELEPHANT | HIPPOPOTAMUS | RHINOCEROS | SWINE | SHEEP) WS* ;

animalPosition : WS* ('rampant' | 'passant' | 'statant' | 'guardant') WS* ('to the sinister')? WS* ;

cadency : 'with' WS* 'a' WS* cadencyNames WS* tincture? WS* ('for' WS* ('difference' | 'distinction'))? ;

cadencyNames : WS* ((LOZENGE | (WS* 'label of' WS* number WS* 'points' WS*) | MULLET | MARTLET | ANNULET | FleurDeLys | ROSE | CrossMoline | DoubleQuatrefoil) ('s' | 'es')?) WS* ;

bordure: WS* 'all'? WS* 'within a bordure' WS* tinctureNames WS* ;

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

WS : (' ' | '\t' | '\r' | '\n')+ ;