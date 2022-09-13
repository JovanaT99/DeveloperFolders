package izvor;

import uredjaji.Potrosac;

public interface Uputsvo {

    Potrosac najveciPotrosac();
    Potrosac najmanjiPotrosac();

    int ukupnaPotrosnja();
    int preostaliKapacitet();
}
