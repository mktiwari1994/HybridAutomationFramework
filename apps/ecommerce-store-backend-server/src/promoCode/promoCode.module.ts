import { Module, forwardRef } from "@nestjs/common";
import { AuthModule } from "../auth/auth.module";
import { PromoCodeModuleBase } from "./base/promoCode.module.base";
import { PromoCodeService } from "./promoCode.service";
import { PromoCodeController } from "./promoCode.controller";
import { PromoCodeResolver } from "./promoCode.resolver";

@Module({
  imports: [PromoCodeModuleBase, forwardRef(() => AuthModule)],
  controllers: [PromoCodeController],
  providers: [PromoCodeService, PromoCodeResolver],
  exports: [PromoCodeService],
})
export class PromoCodeModule {}
