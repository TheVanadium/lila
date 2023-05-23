package lila.study

object JsonFixtures:
  val j1 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","comments":[{"id":"i","text":"Root comment","by":"lichess"}],"dests":"ksA owE bsq gxv jrz nvD muC ltB iqy pxF","children":[{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/3P4/8/PPP1PPPP/RNBQKBNR b KQkq - 0 1","id":".>","uci":"d2d4","san":"d4","glyphs":[{"id":4,"symbol":"??","name":"Blunder"}],"opening":{"eco":"A40","name":"Queen's Pawn Game"},"children":[{"ply":2,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"VF","uci":"d7d5","san":"d5","comments":[{"id":"i","text":"d5 is a good move","by":"lichess"}],"glyphs":[{"id":146,"symbol":"N","name":"Novelty"}],"opening":{"eco":"D00","name":"Queen's Pawn Game"},"children":[]}]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/2P5/8/PP1PPPPP/RNBQKBNR b KQkq - 0 1","id":"-=","uci":"c2c4","san":"c4","comments":[{"id":"i","text":"and","by":"lichess"}],"opening":{"eco":"A10","name":"English Opening"},"children":[]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/5P2/8/PPPPP1PP/RNBQKBNR b KQkq - 0 1","id":"0@","uci":"f2f4","san":"f4","comments":[{"id":"i","text":"best","by":"lichess"}],"opening":{"eco":"A02","name":"Bird Opening"},"children":[]}]},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR b KQkq - 0 1","id":"/?","uci":"e2e4","san":"e4","glyphs":[{"id":1,"symbol":"!","name":"Good move"},{"id":16,"symbol":"±","name":"White is better"},{"id":40,"symbol":"→","name":"Attack"},{"id":32,"symbol":"↑↑","name":"Development"}],"opening":{"eco":"B00","name":"King's Pawn Game"}},{"ply":2,"fen":"rnbqkbnr/pppp1ppp/4p3/8/4P3/8/PPPP1PPP/RNBQKBNR w KQkq - 0 2","id":"WO","uci":"e7e6","san":"e6","comments":[{"id":"i","text":"e6 is a naughty move","by":"lichess"}],"glyphs":[{"id":6,"symbol":"?!","name":"Dubious move"}],"opening":{"eco":"C00","name":"French Defense"}}]
 """.trim

  val j2 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","dests":"ksA owE bsq gxv jrz nvD muC ltB iqy pxF"},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/3P4/8/PPP1PPPP/RNBQKBNR b KQkq - 0 1","id":".>","uci":"d2d4","san":"d4","opening":{"eco":"A40","name":"Queen's Pawn Game"}},{"ply":2,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"VF","uci":"d7d5","san":"d5","opening":{"eco":"D00","name":"Queen's Pawn Game"}},{"ply":3,"fen":"rnbqkbnr/ppp1pppp/8/3p4/3PP3/8/PPP2PPP/RNBQKBNR b KQkq - 0 2","id":"/?","uci":"e2e4","san":"e4","opening":{"eco":"D00","name":"Blackmar-Diemer Gambit"}},{"ply":4,"fen":"rnbqkbnr/ppp2ppp/8/3pp3/3PP3/8/PPP2PPP/RNBQKBNR w KQkq - 0 3","id":"WG","uci":"e7e5","san":"e5","opening":{"eco":"C20","name":"King's Pawn Game: Beyer Gambit"}}]
""".trim

  val j3 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","comments":[{"id":"i","text":"this is a study without moves","by":{"id":"nt9","name":"nt9"}}],"dests":"ksA owE bsq gxv jrz nvD muC ltB iqy pxF"}]
""".trim

  val j4 = """
[{"ply":0,"fen":"rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1","comments":[{"id":"i","text":"shape glyphs","by":{"id":"nt9","name":"nt9"}}],"dests":"ksA owE bsq gxv jrz nvD muC ltB iqy pxF"},{"ply":1,"fen":"rnbqkbnr/pppppppp/8/8/3P4/8/PPP1PPPP/RNBQKBNR b KQkq - 0 1","id":".>","uci":"d2d4","san":"d4","opening":{"eco":"A40","name":"Queen's Pawn Game"},"children":[{"ply":2,"fen":"rnbqkbnr/ppppp1pp/5p2/8/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"XP","uci":"f7f6","san":"f6","children":[{"ply":3,"fen":"rnbqkbnr/ppppp1pp/5p2/8/3P4/2P5/PP2PPPP/RNBQKBNR b KQkq - 0 2","id":"-5","uci":"c2c3","san":"c3","comments":[{"id":"i","text":"jjjjjjjj","by":{"id":"nt9","name":"nt9"}}],"glyphs":[{"id":4,"symbol":"??","name":"Blunder"},{"id":15,"symbol":"⩱","name":"Black is slightly better"},{"id":138,"symbol":"⊕","name":"Time trouble"},{"id":36,"symbol":"↑","name":"Initiative"}],"shapes":[{"brush":"green","orig":"d7"},{"brush":"red","orig":"e7"},{"brush":"blue","orig":"f6"},{"brush":"yellow","orig":"h7"},{"brush":"yellow","orig":"b7"},{"brush":"green","orig":"h4","dest":"f4"},{"brush":"green","orig":"f2","dest":"e4"}],"children":[]},{"ply":3,"fen":"rnbqkbnr/ppppp1pp/5p2/8/3P3P/8/PPP1PPP1/RNBQKBNR b KQkq - 0 2","id":"2B","uci":"h2h4","san":"h4","children":[]}]}]},{"ply":2,"fen":"rnbqkbnr/pp1ppppp/2p5/8/3P4/8/PPP1PPPP/RNBQKBNR w KQkq - 0 2","id":"UM","uci":"c7c6","san":"c6"},{"ply":3,"fen":"rnbqkbnr/pp1ppppp/2p5/8/3P1P2/8/PPP1P1PP/RNBQKBNR b KQkq - 0 2","id":"0@","uci":"f2f4","san":"f4"},{"ply":4,"fen":"rnbqkbnr/pp1pppp1/2p5/7p/3P1P2/8/PPP1P1PP/RNBQKBNR w KQkq - 0 3","id":"ZJ","uci":"h7h5","san":"h5"},{"ply":5,"fen":"rnbqkbnr/pp1pppp1/2p5/7p/3P1P1P/8/PPP1P1P1/RNBQKBNR b KQkq - 0 3","id":"2B","uci":"h2h4","san":"h4","shapes":[{"brush":"blue","orig":"d4"},{"brush":"green","orig":"f4"},{"brush":"green","orig":"f7"},{"brush":"green","orig":"c2","dest":"c4"},{"brush":"green","orig":"d2","dest":"e4"}]}]
  """.trim

  val j5 = """
  [{"ply":3,"fen":"rnbqkbnr/pp1ppppp/2p5/8/3P1P2/8/PPP1P1PP/RNBQKBNR b KQkq - 0 2","comments":[{"id":"i","text":"custom position with Black to move","by":{"id":"nt9","name":"nt9"}}],"dests":"QI 0SK 5O 1TL 7YPG WOG 3VN ZRJ !VT 2UM XPH"},{"ply":4,"fen":"rnbqkbnr/pp1pppp1/2p5/7p/3P1P2/8/PPP1P1PP/RNBQKBNR w KQkq - 0 3","id":"ZJ","uci":"h7h5","san":"h5"},{"ply":5,"fen":"rnbqkbnr/pp1pppp1/2p5/7p/1P1P1P2/8/P1P1P1PP/RNBQKBNR b KQkq - 0 3","id":",<","uci":"b2b4","san":"b4"}]
  """.trim

  val all = List(j1, j2, j3, j4, j5)

