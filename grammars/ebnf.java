/*blazon -> tincture | 
		division tincture ',' |  
		tincture ',' semé |
		tincture ',' semé fieldPosition | 
		division tincture ',' semé fieldPosition |
		division tincture ',' semé |
		tincture ',' fieldPosition | 
		['and'] ordinary* ['over all' ordinary] [cadency]) . */
		
blazon -> division | tincture (fieldPosition charges* |
								semé |
								semé animal 'over all' ordinary |
								ordinary* |
								charges |
								(ordinary ('debruised by' charges ordinaryPosition) | charges | cadency | (charges cadency))
								animal ordinaryPosition tincture |
								seméNames tincture) .
																
tincture -> (tinctureNames ['and' tinctureNames]) | 'of the field' .

tinctureNames -> 'Argent' | 'Or' | 'Gules' | 'Sable' | 'Azure' | 'Vert' | 'Purpure' | 'Murrey' | 'Sanguine' | 'Tenné' | 'Moline' .

division -> (('party' | 'parted') 'per' ordinaryNames tincture) .	

fieldPosition ->  'on a' ordinaryNames tincture (charges | ordinaryPosition) .

ordinaryPosition -> ('and' number 'in' ordinaryPositionNames) | 'in' ordinaryPositionNames | 'and' .

ordinaryPositionNames -> 'chief' | 'base' | 'bend' | 'chevron' | 'pale' | 'fess' .

escutcheonLocations -> 'dexter' | 'sinister' .

direction -> 'palewise' | 'fesswise' .	

semé -> (('semé of' subordinary 's' tincture) | seméNames tincture ) | seméNames .	

seméNames -> 'semy-de-lis' | 'crusily' | 'bezanté' | 'platé' | 'billeté' | 'annulletty' | 'étincellé' | 'gouttée' | 'tortelly' .

ordinary -> [ordinaryPosition] ((number ordinaryNames ['s'] [tincture]) | animal | diminutiveNames) [direction] ordinaryPosition? ['debruised by' (charges | animal)] [escutcheonLocations] .

diminutiveNames -> 'pallet' | 'endorse' | 'bar' | 'barrulet' | 'hamade' | 'ribbon' | 'baton' | 'bendlet sinister' .

charges -> ['between'] number subordinary 's' direction? ordinary* tincture .    

subordinary -> 'lozenge' | 'billet' | 'annulet' | 'roundel' | 'label' | 'fret' | 'baton' | 'horses\' heads' | 'torteaux' | 'roses' | 'spear' | 'shell' | 'quarter' | 'canton' | 'flaunch' | 'gore' | 'gyron' | 'orle' | 'escutcheon' | 'fusil' | 'mascle' | 'rustre' | 'crescents' .

ordinaryNames -> 'fess' | 'pale' | 'bend' | 'bend sinister' | 'saltire' | 'cross' | 'quarterly' | 'chevron' | 'pall' | 'crescent' | 'torteaux'| 'bordure' | 'pile' .

number -> 'a' | 'an' | 'as many' | 'one' | 'two' | 'three' | 'four' | 'five' .

animal -> number animalNames ['s'] animalPosition+ [ordinaryPosition] tincture .

animalNames -> 'lion' | 'tyger' | 'bengal tiger' | 'leopard' | 'fox' | 'wolf' | 'bear' | 'badger' | 'otter' | 'thylacine' | 'panther' | 'cat' | 'hound' | 'weasel' | 'antelope' | 'cow' | 'camel' | 'deer' | 'elephant' | 'hippopotamus' | 'rhinoceros' | 'swine' | 'sheep' .

animalPosition -> 'rampant' | 'segreant' | 'passant' | 'statant' | 'tripant' | 'guardant' .

cadency -> 'with a' cadencyNames tincture 'for' ('difference' | 'distinction') .

cadencyNames -> 'lozenge' | ('label of' number 'points')  | 'crescent' | 'mullet' | 'martlet' | 'annulet' | 'fleur-de-lys' | 'rose' | 'cross moline' | 'double quatrefoil' .


tests:

party per pale argent and gules 												(division)
Argent, on a chevron between three roses gules, as many crescents of the field 	(tincture fieldPosition charges charges)
Azure, semé-de-lis and a lion rampant or, over all a bend gules 				(tincture semé animal 'over all' ordinary)
Gules, a bend or, in chief a crescent argent 									(tincture ordinary ordinary)
Sable, three tilting-spears palewise in fess 									(tincture charges)
per cross vert and murrey 														(divison)
Azure, semé of frets Tenné 														(tincture semé)
Gules, a bend argent, debruised by three spears fesswise in chief				(tincture ordinaryNames tincture 'debruised by' charges ordinaryPosition)
Azure, a bend between two horses' heads or										(tincture ordinary charges)					
Or, three torteaux																(tincture charges)	
Gules, two leopards passant in pale sable										(tincture animal ordinaryPosition)	
Azure, gouttée or																(tincture seméNames tincture)	
Argent, a chevron between three shells Sable, a cross moline for distinction	(tincture ordinaryNames charges cadency)
Vert, a fess azure, a label of seven points gules for difference				(tincture ordinary cadency)