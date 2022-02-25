
public class CPZonas {
	String zona;
	boolean us;
	long Malag[] = { 29001, 29002, 29003, 29004, 29005, 29006, 29007, 29008, 29009, 29010, 29011, 29012, 29013, 29014,
			29015, 29016, 29017, 29018, 29130, 29140, 29190, 29191, 29193, 29195, 29196, 29197, 29570, 29580, 29590,
			29591, 29592, 29600, 29601, 29602, 29603, 29604, 29610, 29611, 29612, 29620, 29630, 29631, 29639, 29640,
			29649, 29650, 29651, 29660, 29720, 29730 };
	long Axarq[] = { 29700, 29710, 29711, 29712, 29713, 29714, 29715, 29716, 29718, 29719, 29738, 29740, 29749, 29750,
			29751, 29752, 29753, 29754, 29755, 29760, 29770, 29780, 29787, 29788, 29789, 29790, 29791, 29792, 29793 };
	long Costa[] = { 29670, 29678, 29679, 29680, 29688, 29689, 29690, 29691, 29692, 29693 };
	long Cordo[] = { 14500, 14510, 14511, 14512, 14520, 14530, 14548, 14550, 14640, 14650, 14659, 14660, 14670, 14800,
			14810, 14811, 14812, 14813, 14814, 14815, 14816, 14817, 14820, 14830, 14840, 14850, 14857, 14858, 14859,
			14860, 14870, 14880, 14900, 14910, 14911, 14912, 14913, 14914, 14915, 14920, 14930, 14940, 14950, 14960,
			14970, 14978, 14979, 41560, 41564, 41565, 41566, 41567, 41569, 41570, 41580, 41590, 41599, 41657, 41658 };
	long Ronda[] = { 29100, 29108, 29109, 29110, 29120, 29340, 29350, 29360, 29370, 29380, 29391, 29392, 29393, 29394,
			29395, 29400, 29410, 29420, 29430, 29440, 29450, 29451, 29452, 29460, 29461, 29462, 29470, 29480, 29490,
			29491, 29492, 29493, 29495, 29500, 29510, 29550, 29551, 29552, 29555, 29560, 29566, 29567, 29569, 29593 };
	long Anteq[] = { 29150, 29160, 29170, 29180, 19192, 19194, 29200, 29210, 29220, 29230, 29239, 29240, 29250, 29260,
			29300, 29310, 29311, 29312, 29313, 29314, 29315, 29320, 29327, 29328, 29329, 29330, 29520, 29530, 29531,
			29532, 29533, 29540, 29553 };

	public CPZonas(long P) {
		boolean encontrado = false;
		for (int n = 0; n < Malag.length; n++) {

			if (P == Malag[n]) {
				this.zona = "Malaga";
				this.us = true;
				encontrado = true;
				break;
			} else {
				this.zona = "";
				this.us = false;
			}
		}
		if (encontrado == false) {
			for (int n = 0; n < Axarq.length; n++) {

				if (P == Axarq[n]) {
					this.zona = "Axarquia";
					this.us = true;
					encontrado = true;
					break;
				} else {
					this.zona = "";
					this.us = false;
				}
			}
		}
		if (encontrado == false) {
			for (int n = 0; n < Costa.length; n++) {

				if (P == Costa[n]) {
					this.zona = "Costa";
					this.us = true;
					encontrado = true;
					break;
				} else {
					this.zona = "";
					this.us = false;
				}
			}
		}
		if (encontrado == false) {
			for (int n = 0; n < Cordo.length; n++) {

				if (P == Cordo[n]) {
					this.zona = "Cordoba";
					this.us = true;
					encontrado = true;
					break;
				} else {
					this.zona = "";
					this.us = false;
				}
			}
		}
		if (encontrado == false) {
			for (int n = 0; n < Ronda.length; n++) {

				if (P == Ronda[n]) {
					this.zona = "Ronda";
					this.us = true;
					encontrado = true;
					break;
				} else {
					this.zona = "";
					this.us = false;
				}
			}
		}
		if (encontrado == false) {
			for (int n = 0; n < Anteq.length; n++) {

				if (P == Anteq[n]) {
					this.zona = "Antequera";
					this.us = true;
					encontrado = true;
					break;
				} else {
					this.zona = "";
					this.us = false;
				}
			}
		}

	}
}
