blazon -> tincture | complexField .

tincture -> (tinctureNames ('and' tinctureNames)?) ','? | 'of the field' .

tinctureNames -> 'Argent' | 'Or' | 'Gules' | 'Sable' | 'Azure' | 'Vert' | 'Purpure' | 'Murrey' | 'Sanguine' | 'Tenné' .

complexField -> coatDivision? tincture semé? fieldPosition? 'and'? ordinary* fieldPosition? cadency? .

fieldPosition -> 'over all' ordinary | ( 'on a ' ordinaryNames tincture? charges?) .

ordinaryPosition -> ('and' number)? 'in' ('chief' | 'base' | 'bend' | 'chevron' | 'pale' | 'fess') .

escutcheonLocations -> 'dexter' | 'sinister' .

direction -> 'palewise' | 'fesswise' .

coatDivision -> ('party' | 'parted')? 'per' ordinaryNames .

semé -> (('semé of' subordinary 's') | 'semy-de-lis' | 'crusily' | 'bezanté' | 'platé' | 'billeté' | 'annulletty' | 'étincellé' | 'gouttée' | 'tortelly') tincture? .

ordinary -> ordinaryPosition? ((number ordinaryNames tincture?) | animal | diminutiveNames) direction? ordinaryPosition? 'debruised by'? (charges | animal)? escutcheonLocations? .

diminutiveNames -> 'pallet' | 'endorse' | 'bar' | 'barrulet' | 'hamade' | 'ribbon' | 'baton' | 'bendlet sinister' | 'bendlet sinister' .

charges -> 'between '? number subordinary 's'? direction? ordinaryPosition* tincture .    

subordinary -> 'lozenge' | 'billet' | 'annulet' | 'roundel' | 'label' | 'fret' | 'baton' | 'horses\' heads' | 'torteaux' | 'roses' | 'spear' | 'shell' | 'quarter' | 'canton' | 'flaunch' | 'gore' | 'gyron' | 'orle' | 'escutcheon' | 'fusil' | 'mascle' | 'rustre' | 'annulet' .

ordinaryNames -> 'fess' | 'pale' | 'bend' | 'bend sinister' | 'saltire' | 'cross' | 'quarterly' | 'chevron ' | 'pall' | 'crescent' | 'torteaux'| 'bordure' | 'pile'.

number -> 'a' | 'an' | 'as many ' | 'one' | 'two' | 'three ' | 'four' | 'five' .

animal -> number animalNames 's'? animalPosition+ ordinaryPosition? tincture .

animalNames -> 'lion' | 'tyger' | 'bengal tiger' | 'leopard' | 'fox' | 'wolf' | 'bear' | 'badger' | 'otter' | 'thylacine' | 'panther' | 'cat' | 'hound' | 'weasel' | 'antelope' | 'cow' | 'camel' | 'deer' | 'elephant' | 'hippopotamus' | 'rhinoceros' | 'swine' | 'sheep' .

animalPosition -> 'rampant' | 'segreant' | 'passant' | 'statant' | 'tripant' | 'guardant'.

cadency -> 'with'? 'a' cadencyNames tincture ('for' ('difference' | 'distinction'))? .

cadencyNames -> 'lozenge' | ('label of' number 'points')  | 'crescent' | 'mullet' | 'martlet' | 'annulet' | 'fleur-de-lys' | 'rose' | 'cross moline' | 'double quatrefoil' .


tests:

party per pale Argent and Gules																		(P)
Argent, on a chevron between three roses Gules, as many crescents of the field						(P)	
Azure, semy-de-lis and a lion rampant Or, over all a bend Gules										(P)
Gules, a bend Or, in chief a crescent Argent														(P)
Sable, three spears palewise in fess																(P)								
per cross Vert and Murrey																			(P)															
seme of frets Tenne																					(F)							
Gules, a bend Argent, debruised by three spears fesswise in chief									(P)
Azure, a bend between two horses' heads Or															(P)
Or, three torteaux																					(P)
Gules, two leopards passant in pale Sable															(P)
Azure, gouttée Or																					(P)
Argent, a chevron between three shells Sable, a cross moline for distinction						(P)
Vert, a fess Azure, a label of seven points Gules for difference									(P)