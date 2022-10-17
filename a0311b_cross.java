import java.lang.Math;
class a0311b_cross {
	public static void main (String[] args) {
		double l1x1in,l1x2in,l1y1in,l1y2in,l2x1in,l2x2in,l2y1in,l2y2in,l1x1,l1x2,l1y1,l1y2,l2x1,l2x2,l2y1,l2y2,a,b,c,d,xs,ys;
		boolean parallel, deckung, crossed;
		int fall;
		l1x1in = 0;
		l1x2in = 0;
		l1y1in = 0;
		l1y2in = 0;
		l2x1in = 0;
		l2x2in = 0;
		l2y1in = 0;
		l2y2in = 0;
		l1x1 = 0;
		l1x2 = 0;
		l1y1 = 0;
		l1y2 = 0;
		l2x1 = 0;
		l2x2 = 0;
		l2y1 = 0;
		l2y2 = 0;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		xs = 0;
		ys = 0;
		parallel = false;
		deckung = false;
		crossed = false;
		fall = 0;

		l1x1in = eingabe.readDouble ("Linie 1, x1:");
		l1y1in = eingabe.readDouble ("Linie 1, y1:");
		l1x2in = eingabe.readDouble ("Linie 1, x2:");
		l1y2in = eingabe.readDouble ("Linie 1, y2:");
		l2x1in = eingabe.readDouble ("Linie 2, x1:");
		l2y1in = eingabe.readDouble ("Linie 2, y1:");
		l2x2in = eingabe.readDouble ("Linie 2, x2:");
		l2y2in = eingabe.readDouble ("Linie 2, y2:");
		//l1, bottom to top
		if ((l1x1in == l1x2in) && (l1y1in < l1y2in))
			{
			l1x1 = l1x1in;
			l1x2 = l1x2in;
			l1y1 = l1y1in;
			l1y2 = l1y2in;
			}
		//l1, top to bottom
		if ((l1x1in == l2x1in) && (l1y1in > l1y2in))
			{
			l1x1 = l1x2in;
			l1y1 = l1y2in;
			l1x2 = l1x1in;
			l1y2 = l1y1in;
			}
		//l1, left to right
		if ((l1x1in < l1x2in) && (l1y2in == l1y2in))
			{
			l1x1 = l1x1in;
			l1x2 = l1x2in;
			l1y1 = l1y1in;
			l1y2 = l1y2in;
			}
		//l1, right to left
		if ((l1x1in > l1x2in) && (l1y1in == l1y2in))
			{
			l1x1 = l1x2in;
			l1y1 = l1y2in;
			l1x2 = l1x1in;
			l1y2 = l1y1in;
			}
		//l1, bottom left to top right
		if ((l1x1in < l1x2in) && (l1y1in < l1y2in))
			{
			l1x1 = l1x1in;
			l1x2 = l1x2in;
			l1y1 = l1y1in;
			l1y2 = l1y2in;
			}
		//l1, top right to bottom left
		if ((l1x1in > l1x2in) && (l1y1in > l1y2in))
			{
			l1x1 = l1x2in;
			l1y1 = l1y2in;
			l1x2 = l1x1in;
			l1y2 = l1y2in;
			}
		//l1, top left to bottom right
		if ((l1x1in < l1x2in) && (l1y1in > l1y2in))
			{
			l1x1 = l1x1in;
			l1x2 = l1x2in;
			l1y1 = l1y1in;
			l1y2 = l1y2in;
			}
		//l1, bottom right to top left
		if ((l1x1in > l1x2in) && (l1y1in < l1y2in))
			{
			l1x1 = l1x2in;
			l1y1 = l1y2in;
			l1x2 = l1x1in;
			l1y2 = l1y1in;
			}
		//l2, bottom to top
		if ((l2x1in == l2x2in) && (l2y1in < l2y2in))
			{
			l2x1 = l2x1in;
			l2x2 = l2x2in;
			l2y1 = l2y1in;
			l2y2 = l2y2in;
			}
		//l2, top to bottom
		if ((l2x1in == l2x2in) && (l2y1in > l2y2in))
			{
			l2x1 = l2x2in;
			l2y1 = l2y2in;
			l2x2 = l2x1in;
			l2y2 = l2y1in;
			}
		//l2, left to right
		if (( l2x1in < l2x2in) && (l2y1in == l2y2in))
			{
			l2x1 = l2x1in;
			l2x2 = l2x2in;
			l2y1 = l2y1in;
			l2y2 = l2y2in;
			}
		//l2, right to left
		if ((l2x1in > l2x2in) && (l2y1in == l2y2in))
			{
			l2x1 = l2x2in;
			l2y1 = l2y2in;
			l2x2 = l2x1in;
			l2y2 = l2y1in;
			}
		//l2, bottom left to top right
		if ((l2x1in < l2x2in) && (l2y1in < l2y2in))
			{
			l2x1 = l2x1in;
			l2x2 = l2x2in;
			l2y1 = l2y1in;
			l2y2 = l2y2in;
			}
		//l2, top right to bottom left
		if ((l2x1in > l2x2in) && (l2y1in > l2y2in))
			{
			l2x1 = l2x2in;
			l2y1 = l2y2in;
			l2x2 = l2x1in;
			l2y2 = l2y1in;
			}
		//l2, top left to bottom right
		if ((l2x1in < l2x2in) && (l2y1in > l2y2in))
			{
			l2x1 = l2x1in;
			l2x2 = l2x2in;
			l2y1 = l2y1in;
			l2y2 = l2y2in;
			}
		//l2, bottom right to top left
		if ((l2x1in > l2x2in) && (l2y1in < l2y2in))
			{
			l2x1 = l2x2in;
			l2y1 = l2y2in;
			l2x2 = l2x1in;
			l2y2 = l2y1in;
			}
		// | * | 1
		if ((l1x1 == l1x2) && (l2x1 == l2x2)) { fall = 1; }
		// | * - 2
		else if ((l1x1 == l1x2) && (l2y1 == l2y2)) { fall = 2; }
		// | * / 3
		else if ((l1x1 == l1x2) && (l2y1 < l2y2)) { fall = 3; }
		// | * \ 4
		else if ((l1x1 == l1x2) && (l2y1 > l2y2)) { fall = 4; }
		// - * | 5
		else if ((l1y1 == l1y2) && (l2x1 == l2x2)) { fall = 5; }
		// - * - 6
		else if ((l1y1 == l1y2) && (l2y1 == l2y2)) { fall = 6; }
		// - * / 7
		else if ((l1y1 == l1y2) && (l2y1 < l2y2)) { fall = 7; }
		// - * \ 8
		else if ((l1y1 == l1y2) && (l2y1 > l2y2)) { fall = 8; }
		// / * | 9
		else if ((l1y1 < l1y2) && (l2x1 == l2x2)) { fall = 9; }
		// / * - 10
		else if ((l1y1 < l1y2) && (l2y1 == l2y2)) { fall = 10; }
		// / * / 11
		else if ((l1y1 < l1y2) && (l2y1 < l2y2)) { fall = 11; }
		// / * \ 12
		else if ((l1y1 < l1y2) && (l2y1 > l2y2)) { fall = 12; }
		// \ * | 13
		else if ((l1y1 > l1y2) && (l2x1 == l2x2)) { fall = 13; }
		// \ * - 14
		else if ((l1y1 > l1y2) && (l2y1 == l2y2)) { fall = 14; }
		// \ * / 15
		else if ((l1y1 > l1y2) && (l2y1 < l2y2)) { fall = 15; }
		// \ * \ 16
		else if ((l1y1 > l1y2) && (l2y1 > l2y2)) { fall = 16; }

		switch (fall)
			{
			// hv * vh 1,2,5,6
			case 1: case 2: case 5: case 6:
				{
				//no content necessary by purpose
				break;
				}
			// | * x 3,4
			case 3: case 4:
				{
				c = (l2y2 - l2y1) / (l2x2 - l2x1);
				d = l2y1 - (c * l2x1);
				xs = l1x1;
				ys = (c * xs) + d;
				break;
				}
			// x * | 9,13
			case 9: case 13:
				{
				a = (l1y2 - l1y1) / (l1x2 - l1x1);
				b = l1y1 - (a * l1x1);
				xs = l2x1;
				ys = (a * xs) + b;
				break;
				}
			case 7: case 8: case 10: case 11: case 12: case 14: case 15: case 16:
				{
				a = (l1y2 - l1y1) / (l1x2 - l1x1);
				c = (l2y2 - l2y1) / (l2x2 - l2x1);
				b = l1y1 - (a * l1x1);
				d = l2y1 - (c * l2x1);
				if (a == c) 
				{
					if (b == d)
					{ deckung = true; }
					else { deckung = false;
					       parallel = true; }
				}
				else { xs = (d - b) / (a - c); }
				ys = (a * xs) + b;
				break;
				}
			default:
				{
				//cannot be reached
				break;
				}
			}
		switch (fall)
			{
			// | * | 1
			case 1:
				{
				if ((l1x1 == l2x1) && (((l2y1 >= l1y1) && (l2y1 <= l1y2)) || ((l2y2 >= l1y1) && (l2y2 <= l1y2))))
					{ crossed = true; }
				else
					{ crossed = false; }
				break;
				}
			// | * - 2
			case 2:
				{
				if (((l2y1 >= l1y1) && (l2y1 <= l1y2)) && ((l1x1 >= l2x1) && (l1x1 <= l2x2)))
					{ crossed = true; }
				else
					{ crossed = false; }
				break;
				}
			// - * | 5
			case 5:
				{
				if (((l2x1 >= l1x1) && (l2x1 <= l1x2)) && ((l1y1 >= l2y1) && (l1y1 <= l2y2)))
					{ crossed = true; }
				else
					{ crossed = false; }
				break;
				}
			// - * - 6
			case 6:
				{
				if ((l1y1 == l2y1) && (((l2x1 >= l1x1) && (l2x1 <= l1x2)) || ((l2x2 >= l1x1) && (l2x2 <= l1x2))))
					{ crossed = true; }
				else
					{ crossed = false; }
				break;
				}
			// | * / 3, | * \ 4
			case 3: case 4:
				{
				if ((ys >= l1y1) && (ys <= l1y1))
					{ crossed = true; }
				else
					{ crossed = false; }
				break;
				}
			// / * | 9, \ * | 13
			case 9: case 13:
				{
				if ((ys >= l2y1) && (ys <= l2y2))
					{ crossed = true; }
				else
					{ crossed = false; }
				break;
				}
			// up-up
			case 10: case 7: case 11:
				{
				if (parallel) { crossed = false; }
				else if (deckung)
					{
					if (((l2x1 >= l1x1) && (l2x1 <= l1x2)) || ((l2x2 >= l1x1) && (l2x2 <= l1x2)))
						{ crossed = true; }
					else { crossed = false; }
					}
				else
					{
					if ((((xs >= l1x1) && (xs <= l1x2)) && ((ys >= l1y1) && (ys <= l1y2))) &&
						(((xs >= l2x1) && (xs <= l2x2)) && ((ys >= l2y1) && (ys <= l2y2))))
						{ crossed = true; }
					else
						{ crossed = false; }
					}
				break;
				}
			// up-down
			case 12:
				{
				if ((((xs >= l1x1) && (xs <= l1x2)) && ((ys >= l1y1) && (ys <= l1y2))) &&
					(((xs >= l2x1) && (xs <= l2x2)) && ((ys <= l2y1) && (ys >= l2y2))))
					{ crossed = true; }
				else
					{ crossed = false; }
				break;
				}
			// down-up
			case 15:
				{
				if ((((xs >= l1x1) && (xs <= l1x2)) && ((ys <= l1y2) && (ys >= l1y2))) &&
					(((xs >= l2x1) && (xs <= l2x2)) && ((ys >= l2y1) && (ys <= l2y2))))
					{ crossed = true; }
				else
					{ crossed = false; }
				break;
				}
			// down-down
			case 16: case 14: case 8:
				{
				if (parallel) { crossed = false; }
				else if (deckung)
					{
					if (((l2x1 >= l1x1) && (l2x1 <= l1x2)) || ((l2x2 >= l1x1) && (l2x2 <= l1x2)))
						{ crossed = true; }
					else { crossed = false; }
					}
				else
					{
					if ((((xs <= l1x1) && (xs >= l1x2)) && ((ys <= l1y1) && (ys >= l1y2))) &&
						(((xs <= l2x1) && (xs >= l2x2)) && ((ys <= l2y1) && (ys >= l2y2))))
						{ crossed = true; }
					else	{ crossed = false; }
					}
				break;
				}				
			//zero
			default:
				{
				//cannot be reached
				break;
				}
			}
			if (crossed)
				{
				System.out.println ("the lines do cross or at least touch");
				}
			else
				{
				System.out.println ("the lines neither cross nor touch");
				}
	}
}
