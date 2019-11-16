//TODO: Change to correct .g4 format for antlr

blazon -> complexField | dividedField .

tincture -> ((tinctureNames ('and' tinctureNames)?) ','?) | 'of the field' | '' .

tinctureNames -> 'Argent' | 'Or' | 'Gules' | 'Sable' | 'Azure' | 'Vert' | 'Purpure' | 'Murrey' | 'Sanguine' | 'Tenné' .

complexField -> tincture | (semé fieldPosition ('and' | '') ordinary fieldPosition cadency) .

dividedField -> coatDivision complexField .

fieldPosition -> (('over all' ordinary) | ( 'on a' ordinaryNames tincture charges)) | '' .

ordinaryPosition -> ((('and' number) | '') 'in' ('chief' | 'base' | 'bend' | 'chevron' | 'pale' | 'fess') (ordinaryPosition | '')) | '' .

escutcheonLocations -> 'dexter' | 'sinister' | '' .

direction -> 'palewise' | 'fesswise' | '' .

coatDivision -> ('party' | 'parted') 'per' ordinaryNames tincture .

semé -> ((('semé of' subordinary 's') | 'semy-de-lis' | 'crusily' | 'bezanté' | 'platé' | 'billeté' | 'annulletty' | 'étincellé' | 'gouttée' | 'tortelly') tincture) | '' .

ordinary -> ((ordinaryPosition ((number ordinaryNames ['s'] tincture) | animal | diminutiveNames) direction ordinaryPosition ['debruised by'] (charges | animal) escutcheonLocations) (ordinary | '')) | '' .

diminutiveNames -> 'pallet' | 'endorse' | 'bar' | 'barrulet' | 'hamade' | 'ribbon' | 'baton' | 'bendlet sinister' .

charges -> ['between'] number subordinary 's' direction ordinaryPosition tincture .    

subordinary -> 'lozenge' | 'billet' | 'annulet' | 'roundel' | 'label' | 'fret' | 'baton' | 'horses\' heads' | 'torteaux' | 'roses' | 'spear' | 'shell' | 'quarter' | 'canton' | 'flaunch' | 'gore' | 'gyron' | 'orle' | 'escutcheon' | 'fusil' | 'mascle' | 'rustre' .

ordinaryNames -> 'fess' | 'pale' | 'bend' | 'bend sinister' | 'saltire' | 'cross' | 'quarterly' | 'chevron' | 'pall' | 'crescent' | 'torteaux'| 'bordure' | 'pile'.

number -> 'a' | 'an' | 'as many' | 'one' | 'two' | 'three' | 'four' | 'five' .

animal -> (number animalNames ['s'] animalPosition+ ordinaryPosition tincture) .

animalNames -> 'lion' | 'tyger' | 'bengal tiger' | 'leopard' | 'fox' | 'wolf' | 'bear' | 'badger' | 'otter' | 'thylacine' | 'panther' | 'cat' | 'hound' | 'weasel' | 'antelope' | 'cow' | 'camel' | 'deer' | 'elephant' | 'hippopotamus' | 'rhinoceros' | 'swine' | 'sheep' .

animalPosition -> 'rampant' | 'segreant' | 'passant' | 'statant' | 'tripant' | 'guardant'.

cadency -> (('with' | '') 'a' cadencyNames tincture 'for' ('difference' | 'distinction')) | '' .

cadencyNames -> 'lozenge' | ('label of' number 'points')  | 'crescent' | 'mullet' | 'martlet' | 'annulet' | 'fleur-de-lys' | 'rose' | 'cross moline' | 'double quatrefoil' .




TESTS:

-party per pale argent and gules 												(division)
Argent, on a chevron between three roses gules, as many lozenges of the field 	(tincture fieldPosition charges charges)
-Azure, semé-de-lis and a lion rampant or, over all a bend gules 				(tincture semé animal 'over all' ordinary)
Gules, a bend or, in chief a lozenge argent 									(tincture ordinary ordinary)
Sable, three spears palewise in fess 									(tincture charges)
-per cross Vert and Murrey 														(divison)
-Azure, semé of frets Tenné 														(tincture semé)
Gules, a bend Argent, debruised by three spears fesswise in chief				(tincture ordinaryNames tincture 'debruised by' charges ordinaryPosition)
Azure, a bend between two roundels or										(tincture ordinary charges)					
-Gules, two leopards passant in pale sable										(tincture animal ordinaryPosition)	
-Azure, gouttée or	(3)															(tincture seméNames tincture)	
Argent, a chevron between three shells Sable, a cross moline for distinction	(tincture ordinaryNames charges cadency)
Vert, a fess azure, a label of seven points gules for difference				(tincture ordinary cadency)

0: tincture
1: [on] (a|qty) ordName [tincture] 
2: seme
3: (in positiom | debruised by | between) qty charges (palewise | fesswise) [in position] [tincture]
4: charges (2nd occurance)
5: qty charge tincture for (distinction | difference)
	
	
	
	


tincture, on a ordinary, tincture, between three charges, some charges
tincture, seme and a charge, tincture, over all the ordinary
tincture, ordinary, tincture, in position some charges, tincture
tincture, some charges, direction, position
tincture, semeName, tincture
tincture, seme of charges, tincture
tincture, ordinary, debruised by some charges, direction, position
tincture, ordianry, between some charges, tincture
tincture, some charges
tincture, ordinary, position, tincture
tincture, seme tincture
tincture, ordinary, between some charges, cadency
tincture, ordinary, cadency




tincture, on a ordinary, tincture, between three charges, some charges
tincture, ordinary, tincture, in position some charges, tincture
tincture, ordinary, debruised by some charges, direction, position
tincture, ordinary, between some charges, tincture
tincture, ordinary, between some charges, tincture, cadency
tincture, ordinary, position, tincture
tincture, ordinary, cadency


---create arrays for tinctures, ordinarys, semeNames, charges, directions, positions


	
	TODO
	------------------------------------------------------------------------------------------------


	tincture, charge, tincture over all the ordinary

	tincture, some charges
	-Or, three torteaux							(3)									

	tincture, seme and a charge, tincture, over all the ordinary
	tincture, semeName, tincture
	tincture, seme of charges, tincture
	tincture, seme tincture

	animals

	cross moline in cadency

	label of n points in cadency

	-------------------------------------------------------------------------------------------------



