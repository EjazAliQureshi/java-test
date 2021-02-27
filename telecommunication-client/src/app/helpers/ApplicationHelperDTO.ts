export class Alert {
    alert: any;
    messageAlert(type: string, message: string, delay: number) {
        this.alert = {
            type: type,
            msg: message,
            timeout: delay,
        };
        return this.alert;
    }
}

export class ServiceResponse {

    code: number = 0;
    status: string = "";
    message: string = "";
    data: any[] = [];
    errors: any[] = [];
}

export class ServiceRequest {
    defaultValues: any = {
        userName: '',
        userId: '',
        companyId: '',
        companyPrefix: '',
        companyType: '',
        lstCompanyProducts: '',
        lstCompanyUsers: '',
        product: '',
        lstProduct: '',
        totalCustomers: '',
        totalChannelPartners: '',
        totalTickets: '',
        numLicenseRemainingDays: '',

    }
}
export class DefaultLists {

    pageSizeOptionsList: any = [10, 50, 100];
    bigPageSizeOptionsList: any = [25, 50, 100];
    legalStatusList = [
        { key: 'UNREGISTERED', value: 'Un-Registered' },
        { key: 'SOLEPROPRIETOR', value: 'Sole Proprietor' },
        { key: 'REGISTEREDPARTNERSHIP', value: 'Registered Partnership' },
        { key: 'REGISTEREDJOINTVENTURE', value: 'Registered Joint Venture' },
        { key: 'PRIVATELIMITED', value: 'Private Limited' },
        { key: 'PUBLICLIMITED', value: 'Public Limited' },
        { key: 'GUARANTEELIMITED', value: 'Guarantee Limited' },
        { key: 'OTHERS', value: 'Others' },
    ];
    businessTurnOverList = [

      { key: 'less than 1 Lakh / annum', value: 'less than 1 Lakh / annum' },
        { key: '1 Lakh / annum', value: '1 Lakh / annum' },
        { key: '1 Lakh To 1 Million / annum', value: '1 Lakh To 1 Million / annum' },
        { key: '1 Million To 10 Million / annum', value: '1 Million To 10 Million / annum' },
        { key: 'Greater 10 Million / annum', value: 'Greater 10 Million / annum' },
    ];
    businessNatureList = [
        { key: 'GOODS', value: 'General order & supplier' },
        { key: 'WORKSSERVICES', value: 'Work & Service' },
        { key: 'CONSULTING', value: 'Consulting' },
        { key: 'OTHERS', value: 'Other' },
    ];
    tenderTypeList = [
        { key: 'SINGLESTAGESINGLEENVELOPE', value: 'Single Stage, Single Envelop' },
        { key: 'SINGLESTAGETWOENVELOPES', value: 'Single Stage Two Envelops' },
    ];

    tenderDocumentList = [
        { key: 'FINANCIALDOCUMENT', value: 'Financial Document' },
        { key: 'BOQDOCUMENT', value: 'Bill of Quotation (BOQ)' },
        { key: 'TECHNICALDOCUMENT', value: 'Technical Document' },
        { key: 'CORRIGENDUM', value: 'Corrigendum' },
        { key: 'RFPDOCUMENT', value: 'Requesrt for Proposal (RFP)' },
        { key: 'OTHER', value: 'Other' },
    ];
    bidDocumentList = [
        { key: 'FINANCIALDOCUMENT', value: 'Financial Document' },
        { key: 'BOQDOCUMENT', value: 'Bill of Quotation (BOQ)' },
        { key: 'TECHNICALDOCUMENT', value: 'Technical Document' },
        { key: 'RFPDOCUMENT', value: 'Requesrt for Proposal (RFP)' },
        { key: 'OTHER', value: 'Other' },
    ];
    instrumentTypeList = [
        { key: 'DEMANDDRAFT', value: 'Demand Draft' },
        { key: 'PAYORDER', value: 'Pay Order' },
        // { key: 'BIDMONEY', value: 'Bid Money' },
        // { key: 'TENDERX', value: 'Tender X' },
        { key: 'OTHER', value: 'Other' },
    ];
    boqTypeList = [
        { key: 'ITEMRATE', value: 'Itemize Rate' },
        { key: 'FIXEDPERCENTAGE', value: 'Above/Below' },
    ];
    tenderStatusList = [
        { key: 'PUBLISHED', value: 'Open Tenders' },
        { key: 'ACTIVE', value: 'Active Tenders' },
        { key: 'TECHOPEN', value: 'Technical Opened Tenders' },
        { key: 'TECHEVALUATED', value: 'Technically Evaluated Tenders' },
        { key: 'FINOPEN', value: 'Financial Opened Tenders' },
        { key: 'FINEVALUATED', value: 'Financially Evaluated Tenders' },
        { key: 'AWARD', value: 'Awarded Tenders' },
        { key: 'CLOSED', value: 'Closed Tenders' },
        { key: 'CANCELLED', value: 'Canceled Tenders' },
        // { key: 'WITHHELD', value: 'Withheld Tenders' },
    ];
    documentTypeList = [
        { key: 'CORRIGENDUM', value: 'Corrigendum' },
        { key: 'TENDER', value: 'Tender' },

    ];
}