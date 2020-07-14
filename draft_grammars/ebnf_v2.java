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
	
	(whole application)

	party per pale Argent and Gules 		
	parted per fess Vert and Azure
	quarterly Or and Sable
F	per cross Vert and Murrey 	
F	Argent, on a chevron between three roses Gules, as many lozenges of the field 	(tincture fieldPosition charges charges)
	Argent, a chevron Gules between three roses Gules, charged with three lozenges Argent
F	Azure, semy-de-lis and a lion rampant Or, over all a bend Gules 				(tincture semé animal 'over all' ordinary)
	Gules, a bend Or, in chief a lozenge Argent 									(tincture ordinary ordinary)
F	Sable, three spears palewise in fess 											(tincture charges)
	Sable, a bend Argent in fess three spears palewise Gules									
	Vert a chevron Gules between two spears fesswise Azure
F	Azure, seme of frets Tenne 														(tincture semé)
	Azure, a bend Argent between two roundels Or											(tincture ordinary charges)					
F	Azure, a bend between two roundels Or
F	Gules, two leopards passant in pale Sable										(tincture animal ordinaryPosition)	
	Gules, a lion passant Sable
	Azure, an antelope statant to the sinister Vert
F	Azure, gouttee Or															(tincture seméNames tincture)	
	Argent, a chevron Gules between three roses Sable, with a lozenge Argent for distinction
	Azure, a bordure Gules
	Gules, a bend sinister Argent charged with three roses Azure between two spears Or all within a bordure Vert
	Azure, a chevron Argent debruised by three roses Gules over all two spears fesswise Vert 
	Azure, a chevron Argent in chevron two spears fesswise Vert in base a rose Gules
	Vert, a bend sinister Gules and in fess a spear Argent
	Or, a bend Argent with a label of three points for difference
	Gules, a pale Vert charged with three roses Purpure all within a bordure Or
	

	
	
	
0: division
1: tincture
2: seme
3: fieldPosition
4: [on] (a|qty) ordName [tincture] 
5: (in positiom | debruised by | between) qty charges (palewise | fesswise) [in position] [tincture]
6: charges (2nd occurance)
7: qty charge tincture for (distinction | difference)
	
	
	
	


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



